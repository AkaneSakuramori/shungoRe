package u2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.PowerManager;
import com.shungo.app.InjectorService;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4708a;

    public d(InjectorService injectorService) {
        this.f4708a = injectorService;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        InjectorService injectorService;
        Sensor sensor;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 8 || (sensor = (injectorService = this.f4708a).f1637e) == null || injectorService.f1639g == null) {
            return;
        }
        float f5 = sensorEvent.values[0];
        c3.h.X(sensor);
        if (f5 < sensor.getMaximumRange()) {
            PowerManager.WakeLock wakeLock = injectorService.f1639g;
            c3.h.X(wakeLock);
            if (wakeLock.isHeld()) {
                return;
            }
            PowerManager.WakeLock wakeLock2 = injectorService.f1639g;
            c3.h.X(wakeLock2);
            wakeLock2.acquire();
            return;
        }
        PowerManager.WakeLock wakeLock3 = injectorService.f1639g;
        c3.h.X(wakeLock3);
        if (wakeLock3.isHeld()) {
            PowerManager.WakeLock wakeLock4 = injectorService.f1639g;
            c3.h.X(wakeLock4);
            wakeLock4.release();
        }
    }
}
