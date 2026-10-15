.class public final Le/z;
.super Le/b0;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Le/e0;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le/e0;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le/z;->c:I

    iput-object p1, p0, Le/z;->d:Le/e0;

    .line 2
    invoke-direct {p0, p1}, Le/b0;-><init>(Le/e0;)V

    .line 3
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Le/z;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le/e0;Le/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le/z;->c:I

    iput-object p1, p0, Le/z;->d:Le/e0;

    .line 1
    invoke-direct {p0, p1}, Le/b0;-><init>(Le/e0;)V

    iput-object p2, p0, Le/z;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()Landroid/content/IntentFilter;
    .locals 2

    iget v0, p0, Le/z;->c:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Le/z;->c:I

    const/4 v3, 0x1

    iget-object v4, v0, Le/z;->e:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v4, Le/c;

    iget-object v1, v4, Le/c;->e:Ljava/lang/Object;

    check-cast v1, Le/p0;

    iget-wide v5, v1, Le/p0;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-lez v5, :cond_0

    iget-boolean v1, v1, Le/p0;->a:Z

    goto/16 :goto_7

    :cond_0
    iget-object v5, v4, Le/c;->c:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    const-string v6, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v5, v6}, Lc3/h;->e0(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_1

    const-string v5, "network"

    invoke-virtual {v4, v5}, Le/c;->m(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    iget-object v7, v4, Le/c;->c:Ljava/lang/Object;

    check-cast v7, Landroid/content/Context;

    const-string v8, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v7, v8}, Lc3/h;->e0(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_2

    const-string v6, "gps"

    invoke-virtual {v4, v6}, Le/c;->m(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v6

    :cond_2
    if-eqz v6, :cond_3

    if-eqz v5, :cond_3

    invoke-virtual {v6}, Landroid/location/Location;->getTime()J

    move-result-wide v7

    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-lez v7, :cond_4

    :goto_1
    move-object v5, v6

    goto :goto_2

    :cond_3
    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v5, :cond_b

    iget-object v4, v4, Le/c;->e:Ljava/lang/Object;

    check-cast v4, Le/p0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sget-object v6, Le/o0;->d:Le/o0;

    if-nez v6, :cond_5

    new-instance v6, Le/o0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    sput-object v6, Le/o0;->d:Le/o0;

    :cond_5
    sget-object v11, Le/o0;->d:Le/o0;

    const-wide/32 v22, 0x5265c00

    sub-long v16, v13, v22

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v18

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v20

    move-object v15, v11

    invoke-virtual/range {v15 .. v21}, Le/o0;->a(JDD)V

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v15

    move-object v6, v11

    move-wide v7, v13

    move-object v2, v11

    move-wide v11, v15

    invoke-virtual/range {v6 .. v12}, Le/o0;->a(JDD)V

    iget v6, v2, Le/o0;->c:I

    if-ne v6, v3, :cond_6

    move v6, v3

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    :goto_3
    iget-wide v7, v2, Le/o0;->b:J

    iget-wide v9, v2, Le/o0;->a:J

    add-long v16, v13, v22

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v18

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v20

    move-object v15, v2

    invoke-virtual/range {v15 .. v21}, Le/o0;->a(JDD)V

    iget-wide v11, v2, Le/o0;->b:J

    const-wide/16 v15, -0x1

    cmp-long v2, v7, v15

    if-eqz v2, :cond_a

    cmp-long v2, v9, v15

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    cmp-long v2, v13, v9

    if-lez v2, :cond_8

    move-wide v7, v11

    goto :goto_4

    :cond_8
    cmp-long v2, v13, v7

    if-lez v2, :cond_9

    move-wide v7, v9

    :cond_9
    :goto_4
    const-wide/32 v9, 0xea60

    add-long/2addr v7, v9

    goto :goto_6

    :cond_a
    :goto_5
    const-wide/32 v7, 0x2932e00

    add-long/2addr v7, v13

    :goto_6
    iput-boolean v6, v4, Le/p0;->a:Z

    iput-wide v7, v4, Le/p0;->b:J

    iget-boolean v1, v1, Le/p0;->a:Z

    :goto_7
    if-eqz v1, :cond_c

    goto :goto_8

    :cond_b
    const-string v1, "TwilightManager"

    const-string v2, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_d

    const/16 v2, 0x16

    if-lt v1, v2, :cond_c

    goto :goto_8

    :cond_c
    move v2, v3

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v2, 0x2

    :goto_9
    return v2

    :pswitch_0
    check-cast v4, Landroid/os/PowerManager;

    invoke-virtual {v4}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v2, 0x2

    goto :goto_a

    :cond_e
    move v2, v3

    :goto_a
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()V
    .locals 3

    iget v0, p0, Le/z;->c:I

    iget-object v1, p0, Le/z;->d:Le/e0;

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, v2, v2}, Le/e0;->n(ZZ)Z

    return-void

    :pswitch_0
    invoke-virtual {v1, v2, v2}, Le/e0;->n(ZZ)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
