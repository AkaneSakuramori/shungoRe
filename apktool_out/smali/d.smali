.class public final Ld;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public f:I

.field public final synthetic g:Le;


# direct methods
.method public constructor <init>(Le;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Ld;->g:Le;

    invoke-direct {p0, p2}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 2

    new-instance v0, Ld;

    iget-object v1, p0, Ld;->g:Le;

    invoke-direct {v0, v1, p1}, Ld;-><init>(Le;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Ld;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Ld;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Ld;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const-string v0, "Start failed: "

    const-string v1, "stored: "

    sget-object v2, Ld3/a;->b:Ld3/a;

    iget v3, p0, Ld;->f:I

    sget-object v4, Lz2/f;->a:Lz2/f;

    const-string v5, "context"

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    iget-object v11, p0, Ld;->g:Le;

    if-eqz v3, :cond_3

    if-eq v3, v10, :cond_2

    if-eq v3, v9, :cond_1

    if-ne v3, v7, :cond_0

    :try_start_0
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    :try_start_2
    sget-object p1, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    new-instance v3, Lc;

    invoke-direct {v3, v8}, Le3/g;-><init>(Lc3/e;)V

    iput v10, p0, Ld;->f:I

    invoke-static {p1, v3, p0}, Lc3/h;->L2(Lkotlinx/coroutines/scheduling/c;Lj3/p;Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, v11, Le;->a:Landroid/content/Context;

    const-string v1, "Your device is not rooted!"

    const-string v2, "You need a rooted device to use this application! If you are, give permission to Shungo inside Magisk"

    invoke-static {p1, v1, v2}, Lc3/h;->y2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, v11, Le;->a:Landroid/content/Context;

    check-cast p1, Lcom/shungo/app/MainActivity;

    invoke-virtual {p1, v6}, Lcom/shungo/app/MainActivity;->p(Z)V

    return-object v4

    :cond_5
    :try_start_3
    iget-object p1, v11, Le;->a:Landroid/content/Context;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v3, v11, Le;->a:Landroid/content/Context;

    :try_start_4
    move-object v12, p1

    check-cast v12, Lcom/shungo/app/MainActivity;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v12, "com.nianticlabs.pokemongo"

    invoke-static {p1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v12, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    move-object p1, v3

    check-cast p1, Lcom/shungo/app/MainActivity;

    iget-object p1, p1, Lcom/shungo/app/MainActivity;->z:Ll1/a;

    if-eqz p1, :cond_9

    check-cast v3, Lcom/shungo/app/MainActivity;

    invoke-virtual {v3, v10}, Lcom/shungo/app/MainActivity;->p(Z)V

    sget-object p1, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    new-instance v3, Lb;

    invoke-direct {v3, v11, v8}, Lb;-><init>(Le;Lc3/e;)V

    iput v9, p0, Ld;->f:I

    invoke-static {p1, v3, p0}, Lc3/h;->L2(Lkotlinx/coroutines/scheduling/c;Lj3/p;Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    return-object v2

    :cond_6
    :goto_1
    iget-object p1, v11, Le;->a:Landroid/content/Context;

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v9

    invoke-direct {v3, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput v7, p0, Ld;->f:I

    sget-object v7, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    new-instance v9, Lv2/b;

    invoke-direct {v9, p1, v3, v8}, Lv2/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lc3/e;)V

    invoke-static {v7, v9, p0}, Lc3/h;->L2(Lkotlinx/coroutines/scheduling/c;Lj3/p;Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    return-object v2

    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    if-eqz p1, :cond_8

    iget-object p1, v11, Le;->a:Landroid/content/Context;

    const-string v1, "Injecting !"

    invoke-static {p1, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, v11, Le;->a:Landroid/content/Context;

    invoke-static {p1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/shungo/app/InjectorService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_8
    iget-object p1, v11, Le;->a:Landroid/content/Context;

    :goto_3
    check-cast p1, Lcom/shungo/app/MainActivity;

    invoke-virtual {p1, v6}, Lcom/shungo/app/MainActivity;->p(Z)V

    goto :goto_5

    :cond_9
    :try_start_7
    const-string p1, "Login required"

    invoke-static {v3, p1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    check-cast v3, Lcom/shungo/app/MainActivity;

    invoke-virtual {v3, v6}, Lcom/shungo/app/MainActivity;->p(Z)V

    return-object v4

    :catch_1
    :try_start_8
    const-string p1, "Pok\u00e9mon GO not installed"

    const-string v1, "Pok\u00e9mon GO was not found on your device, please install it before injecting."

    invoke-static {v3, p1, v1}, Lc3/h;->y2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    check-cast v3, Lcom/shungo/app/MainActivity;

    invoke-virtual {v3, v6}, Lcom/shungo/app/MainActivity;->p(Z)V

    return-object v4

    :goto_4
    :try_start_9
    const-string v1, "Shungo"

    const-string v2, "start failed"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, v11, Le;->a:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    iget-object p1, v11, Le;->a:Landroid/content/Context;

    goto :goto_3

    :goto_5
    return-object v4

    :goto_6
    iget-object v0, v11, Le;->a:Landroid/content/Context;

    check-cast v0, Lcom/shungo/app/MainActivity;

    invoke-virtual {v0, v6}, Lcom/shungo/app/MainActivity;->p(Z)V

    throw p1
.end method
