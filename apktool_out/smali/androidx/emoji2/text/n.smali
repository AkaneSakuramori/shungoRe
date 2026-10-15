.class public final synthetic Landroidx/emoji2/text/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Landroidx/emoji2/text/n;->b:I

    iput-object p1, p0, Landroidx/emoji2/text/n;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/emoji2/text/n;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/emoji2/text/n;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Landroidx/emoji2/text/n;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/emoji2/text/n;->c:Ljava/lang/Object;

    check-cast v0, Ly2/c;

    iget-object v1, p0, Landroidx/emoji2/text/n;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/emoji2/text/n;->e:Ljava/lang/Object;

    check-cast v2, Ly2/f;

    sget-object v3, Ly2/c;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ly2/c;->Q2()Ly2/h;

    move-result-object v0

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    invoke-virtual {v2, v0}, Ly2/f;->b(Lc3/h;)V

    goto :goto_0

    :cond_0
    new-instance v3, Le/k0;

    const/16 v4, 0xc

    invoke-direct {v3, v0, v4, v2}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/emoji2/text/n;->c:Ljava/lang/Object;

    check-cast v0, Lcom/shungo/app/InjectorService;

    iget-object v1, p0, Landroidx/emoji2/text/n;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Landroidx/emoji2/text/n;->e:Ljava/lang/Object;

    check-cast v2, Lorg/json/JSONObject;

    sget v3, Lcom/shungo/app/InjectorService;->o:I

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lcom/shungo/app/InjectorService;->c:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "sendInformations(\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', \'"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_2
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/emoji2/text/n;->c:Ljava/lang/Object;

    check-cast v0, Ll2/g;

    iget-object v1, p0, Landroidx/emoji2/text/n;->d:Ljava/lang/Object;

    check-cast v1, Lm/f;

    iget-object v2, p0, Landroidx/emoji2/text/n;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2}, Ll2/g;->b(Lm/f;Ljava/lang/Runnable;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/emoji2/text/n;->c:Ljava/lang/Object;

    check-cast v0, Lg/a;

    iget-object v1, p0, Landroidx/emoji2/text/n;->d:Ljava/lang/Object;

    check-cast v1, Lc3/h;

    iget-object v2, p0, Landroidx/emoji2/text/n;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, Lg/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lc3/h;->w0(Landroid/content/Context;)Landroidx/emoji2/text/v;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, v0, Landroidx/emoji2/text/i;->a:Landroidx/emoji2/text/l;

    check-cast v3, Landroidx/emoji2/text/u;

    iget-object v4, v3, Landroidx/emoji2/text/u;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v2, v3, Landroidx/emoji2/text/u;->f:Ljava/util/concurrent/Executor;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v0, Landroidx/emoji2/text/i;->a:Landroidx/emoji2/text/l;

    new-instance v3, Landroidx/emoji2/text/o;

    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/o;-><init>(Lc3/h;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Landroidx/emoji2/text/l;->a(Lc3/h;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {v1, v0}, Lc3/h;->E1(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
