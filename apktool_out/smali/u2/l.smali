.class public final Lu2/l;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/shungo/app/InjectorService;

.field public final synthetic c:Lcom/shungo/app/InjectorService;


# direct methods
.method public constructor <init>(Lcom/shungo/app/InjectorService;Lcom/shungo/app/InjectorService;)V
    .locals 0

    iput-object p1, p0, Lu2/l;->b:Lcom/shungo/app/InjectorService;

    iput-object p2, p0, Lu2/l;->c:Lcom/shungo/app/InjectorService;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "verify ping task - executed at "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v2, p0, Lu2/l;->b:Lcom/shungo/app/InjectorService;

    iget-object v4, v2, Lcom/shungo/app/InjectorService;->i:Ljava/lang/Long;

    if-nez v4, :cond_0

    const-string v0, "verify ping task - no last ping"

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v0, v4

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "verify ping task - last ping at "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/shungo/app/InjectorService;->i:Ljava/lang/Long;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " ms ago"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-wide/32 v4, 0x493e0

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    const-string v0, "you pinged too long ago, restarting..."

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v0, v2, Lcom/shungo/app/InjectorService;->k:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x1

    iput-boolean v0, v2, Lcom/shungo/app/InjectorService;->j:Z

    iget-object v0, p0, Lu2/l;->c:Lcom/shungo/app/InjectorService;

    invoke-static {v0}, Lc3/h;->B2(Landroid/content/Context;)V

    :cond_1
    :goto_0
    return-void
.end method
