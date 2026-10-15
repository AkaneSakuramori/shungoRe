.class public final Ll2/f;
.super Ll/d;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/Runnable;

.field public c:Ljava/lang/Runnable;

.field public final synthetic d:Ll2/g;


# direct methods
.method public constructor <init>(Ll2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/f;->d:Ll2/g;

    return-void
.end method


# virtual methods
.method public final a(Lg/h;)V
    .locals 6

    iget-object v0, p0, Ll2/f;->d:Ll2/g;

    iget-object v1, v0, Ll2/g;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    sget-object v2, Ll2/a;->a:Ljava/util/List;

    iget-object v3, v0, Ll2/g;->b:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const v2, 0x15f3cfe0

    invoke-static {v1, v3, v2}, Ll2/a;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_2

    :try_start_0
    iget-object v1, p1, Lg/h;->c:Ljava/lang/Object;

    check-cast v1, La/e;

    check-cast v1, La/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v4, "android.support.customtabs.ICustomTabsService"

    invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v1, v1, La/c;->a:Landroid/os/IBinder;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-interface {v1, v4, v2, v3, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    sget v1, La/d;->a:I

    :cond_1
    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V

    invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    :try_start_3
    iget v1, v0, Ll2/g;->d:I

    iget-object v2, p1, Lg/h;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/high16 v4, 0x4000000

    invoke-static {v2, v1, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg/h;->j(Landroid/app/PendingIntent;)Ll/e;

    move-result-object p1

    iput-object p1, v0, Ll2/g;->f:Ll/e;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ll2/f;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    iget-object p1, p0, Ll2/f;->c:Ljava/lang/Runnable;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :goto_1
    const-string v0, "TwaLauncher"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Ll2/f;->c:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_4
    :goto_2
    const/4 p1, 0x0

    iput-object p1, p0, Ll2/f;->b:Ljava/lang/Runnable;

    iput-object p1, p0, Ll2/f;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Ll2/f;->d:Ll2/g;

    const/4 v0, 0x0

    iput-object v0, p1, Ll2/g;->f:Ll/e;

    return-void
.end method
