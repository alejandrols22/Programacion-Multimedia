package com.multimedia.ejercicio5fragmentos.ejercicio


import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.multimedia.ejercicio5fragmentos.R

class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID = "channel_id_example"
    private val notificationId = 101
    private val MY_PERMISSIONS_REQUEST_POST_NOTIFICATIONS = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crear el canal de notificación al iniciar la aplicación
        createNotificationChannel()

        // Verificar permiso y mostrar una notificación
        checkAndSendNotification()
    }

    private fun createNotificationChannel() {
        // Crear el canal de notificaciones para API 26+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Registrar el canal en el sistema
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun checkAndSendNotification() {
        // Verificar permiso para Android 13 (API nivel 33) o superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                // Solicitar el permiso
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), MY_PERMISSIONS_REQUEST_POST_NOTIFICATIONS)
            } else {
                // Permiso ya otorgado
                sendNotification()
            }
        } else {
            // Sistema operativo anterior a Android 13, enviar notificación directamente
            sendNotification()
        }
    }

    private fun sendNotification() {
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("Mi notificación")
            .setContentText("Este es el contenido de la notificación.")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)) {
            notify(notificationId, builder.build())
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == MY_PERMISSIONS_REQUEST_POST_NOTIFICATIONS) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // El permiso fue otorgado, ahora puedes mostrar la notificación
                sendNotification()
            } else {
                // El permiso fue denegado. Manejar la situación según la lógica de la aplicación
            }
        }
    }
}
