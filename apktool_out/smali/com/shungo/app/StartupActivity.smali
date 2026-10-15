.class public final Lcom/shungo/app/StartupActivity;
.super Le/m;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final x:Landroidx/activity/result/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Le/m;-><init>()V

    sget-object v0, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ly2/d;->a()Ly2/m;

    new-instance v0, Lc/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/c;-><init>(I)V

    new-instance v1, Lu2/v;

    invoke-direct {v1, p0}, Lu2/v;-><init>(Lcom/shungo/app/StartupActivity;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "activity_rq#"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/activity/n;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Landroidx/activity/n;->l:Landroidx/activity/i;

    invoke-virtual {v3, v2, p0, v0, v1}, Landroidx/activity/result/g;->c(Ljava/lang/String;Landroidx/lifecycle/r;Lc3/h;Landroidx/activity/result/c;)Landroidx/activity/result/d;

    move-result-object v0

    iput-object v0, p0, Lcom/shungo/app/StartupActivity;->x:Landroidx/activity/result/d;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/u;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lu2/n;->a:Lu2/n;

    invoke-virtual {p1, p0}, Lu2/n;->a(Landroid/content/Context;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_0

    const-string p1, "android.permission.POST_NOTIFICATIONS"

    invoke-static {p0, p1}, Lz/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shungo/app/StartupActivity;->x:Landroidx/activity/result/d;

    invoke-virtual {v0, p1}, Landroidx/activity/result/d;->Q2(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lu2/v;

    invoke-direct {p1, p0}, Lu2/v;-><init>(Lcom/shungo/app/StartupActivity;)V

    sget-object v0, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    sget-object v0, Ly2/q;->b:Lj/a;

    invoke-static {v0, p1}, Ly2/d;->b(Lj/a;Lx2/b;)V

    :goto_0
    return-void
.end method
