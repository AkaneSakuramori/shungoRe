.class public final Li/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Li/j;->b:I

    iput-object p1, p0, Li/j;->d:Ljava/lang/Object;

    iput-object p3, p0, Li/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Li/j;->b:I

    iput-object p1, p0, Li/j;->c:Ljava/lang/Object;

    iput-object p2, p0, Li/j;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Li/j;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Li/j;->b:I

    iget-object v3, p0, Li/j;->d:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    check-cast v0, Landroidx/fragment/app/d1;

    invoke-virtual {v0}, Landroidx/fragment/app/d1;->c()V

    return-void

    :pswitch_1
    check-cast v0, Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/b0;->b()V

    return-void

    :pswitch_2
    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Landroidx/fragment/app/r0;->b(Ljava/util/ArrayList;I)V

    return-void

    :pswitch_3
    :try_start_0
    sget-object v2, Ly/g;->d:Ljava/lang/reflect/Method;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, v6, v5

    const-string v1, "AppCompat recreation"

    aput-object v1, v6, v4

    invoke-virtual {v2, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v2, Ly/g;->e:Ljava/lang/reflect/Method;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, v4, v5

    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_0
    const-string v1, "ActivityRecreator"

    const-string v2, "Exception while invoking performStopActivity"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/RuntimeException;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to stop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    throw v0

    :cond_2
    :goto_2
    return-void

    :pswitch_4
    check-cast v0, Landroid/app/Application;

    check-cast v3, Ly/f;

    invoke-virtual {v0, v3}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    :pswitch_5
    check-cast v0, Ly/f;

    iput-object v3, v0, Ly/f;->a:Ljava/lang/Object;

    return-void

    :pswitch_6
    check-cast v3, Li/m;

    iget-object v2, v3, Li/m;->d:Lh/o;

    if-eqz v2, :cond_3

    iget-object v4, v2, Lh/o;->e:Lh/m;

    if-eqz v4, :cond_3

    invoke-interface {v4, v2}, Lh/m;->d(Lh/o;)V

    :cond_3
    iget-object v2, v3, Li/m;->i:Lh/e0;

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v0, Li/h;

    invoke-virtual {v0}, Lh/a0;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lh/a0;->f:Landroid/view/View;

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v1, v1, v1, v1}, Lh/a0;->d(IIZZ)V

    :goto_3
    iput-object v0, v3, Li/m;->t:Li/h;

    :cond_6
    :goto_4
    const/4 v0, 0x0

    iput-object v0, v3, Li/m;->v:Li/j;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
