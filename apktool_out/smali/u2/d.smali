.class public final Lu2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:Lcom/shungo/app/InjectorService;


# direct methods
.method public constructor <init>(Lcom/shungo/app/InjectorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/d;->a:Lcom/shungo/app/InjectorService;

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lu2/d;->a:Lcom/shungo/app/InjectorService;

    iget-object v1, v0, Lcom/shungo/app/InjectorService;->e:Landroid/hardware/Sensor;

    if-eqz v1, :cond_2

    iget-object v2, v0, Lcom/shungo/app/InjectorService;->g:Landroid/os/PowerManager$WakeLock;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v2, 0x0

    aget p1, p1, v2

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getMaximumRange()F

    move-result v1

    cmpg-float p1, p1, v1

    if-gez p1, :cond_1

    iget-object p1, v0, Lcom/shungo/app/InjectorService;->g:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, v0, Lcom/shungo/app/InjectorService;->g:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    goto :goto_0

    :cond_1
    iget-object p1, v0, Lcom/shungo/app/InjectorService;->g:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v0, Lcom/shungo/app/InjectorService;->g:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_2
    :goto_0
    return-void
.end method
