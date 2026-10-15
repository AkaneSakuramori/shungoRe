.class public abstract Ll/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public a:Landroid/content/Context;


# virtual methods
.method public abstract a(Lg/h;)V
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Ll/d;->a:Landroid/content/Context;

    if-eqz v0, :cond_2

    new-instance v0, Lg/h;

    sget v1, La/d;->a:I

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v1, "android.support.customtabs.ICustomTabsService"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, La/e;

    if-eqz v2, :cond_1

    move-object p2, v1

    check-cast p2, La/e;

    goto :goto_0

    :cond_1
    new-instance v1, La/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p2, v1, La/c;->a:Landroid/os/IBinder;

    move-object p2, v1

    :goto_0
    iget-object v1, p0, Ll/d;->a:Landroid/content/Context;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lg/h;->e:Ljava/lang/Object;

    iput-object p2, v0, Lg/h;->c:Ljava/lang/Object;

    iput-object p1, v0, Lg/h;->d:Ljava/lang/Object;

    iput-object v1, v0, Lg/h;->b:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/d;->a(Lg/h;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Custom Tabs Service connected before an applicationcontext has been provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
