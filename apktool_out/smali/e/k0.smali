.class public final synthetic Le/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le/k0;->b:I

    iput-object p1, p0, Le/k0;->c:Ljava/lang/Object;

    iput-object p3, p0, Le/k0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Le/k0;->b:I

    const/4 v1, 0x0

    const-string v2, "$callback"

    const/4 v3, 0x1

    iget-object v4, p0, Le/k0;->d:Ljava/lang/Object;

    iget-object v5, p0, Le/k0;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Ly2/h;

    check-cast v4, Ly2/f;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ly2/f;->b(Lc3/h;)V

    return-void

    :pswitch_0
    check-cast v5, Lx2/b;

    check-cast v4, Lx2/d;

    invoke-interface {v5, v4}, Lx2/b;->a(Lx2/d;)V

    return-void

    :pswitch_1
    check-cast v5, Ljava/util/concurrent/Executor;

    check-cast v4, Lx2/b;

    :try_start_0
    invoke-static {}, Ly2/d;->a()Ly2/m;

    move-result-object v0

    if-nez v5, :cond_0

    invoke-interface {v4, v0}, Lx2/b;->a(Lx2/d;)V

    goto :goto_0

    :cond_0
    new-instance v1, Le/k0;

    const/16 v2, 0xb

    invoke-direct {v1, v4, v2, v0}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v5, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lx2/a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void

    :pswitch_2
    check-cast v5, Lcom/shungo/app/MainActivity;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v5}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "setUserInfo("

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x29

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    invoke-static {v5}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {v5}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v1

    new-instance v2, Lu2/p;

    invoke-direct {v2, v5, v0, v3}, Lu2/p;-><init>(Landroid/view/KeyEvent$Callback;ZI)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_3
    check-cast v5, Landroid/content/Context;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_4
    check-cast v5, Landroid/content/Context;

    check-cast v4, Lw2/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Download Error "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v4, :cond_1

    iget v1, v4, Lw2/a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_5
    check-cast v5, Li1/a;

    check-cast v4, Lf1/b;

    invoke-static {v5, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uError"

    invoke-static {v4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v4}, Li1/a;->a(Lf1/b;)V

    return-void

    :pswitch_6
    check-cast v5, Li1/a;

    invoke-static {v5, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v4}, Li1/a;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_7
    check-cast v5, Lcom/auth0/android/request/internal/a;

    check-cast v4, Li1/a;

    const-string v0, "this$0"

    invoke-static {v5, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Lcom/auth0/android/request/internal/a;->e:Lcom/auth0/android/request/internal/m;

    invoke-static {v4, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v5}, Lcom/auth0/android/request/internal/a;->c()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Le/k0;

    const/4 v3, 0x5

    invoke-direct {v2, v4, v3, v1}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0, v2}, Lcom/auth0/android/request/internal/m;->b(Le/k0;)V
    :try_end_1
    .catch Lf1/b; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    new-instance v2, Le/k0;

    const/4 v3, 0x6

    invoke-direct {v2, v4, v3, v1}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0, v2}, Lcom/auth0/android/request/internal/m;->b(Le/k0;)V

    :goto_1
    return-void

    :pswitch_8
    check-cast v5, Lj1/f;

    check-cast v4, Lg1/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "error"

    invoke-static {v4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Lj1/f;->a:Lcom/auth0/android/provider/AuthenticationActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lj1/p0;->b:Lc3/h;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Lc3/h;->J0(Lg1/c;)V

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_9
    check-cast v5, Landroidx/profileinstaller/ProfileInstallerInitializer;

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lw0/h;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_2
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x3e8

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    new-instance v2, Le/o;

    invoke-direct {v2, v4, v3}, Le/o;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v1, v1, 0x1388

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_a
    check-cast v5, Lc3/h;

    check-cast v4, Landroid/graphics/Typeface;

    invoke-virtual {v5, v4}, Lc3/h;->H1(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_b
    check-cast v5, Le/l0;

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v5}, Le/l0;->a()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Le/l0;->a()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
