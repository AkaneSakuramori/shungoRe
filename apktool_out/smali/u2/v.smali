.class public final synthetic Lu2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/c;
.implements Lx2/b;


# instance fields
.field public final synthetic a:Lcom/shungo/app/StartupActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/shungo/app/StartupActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/v;->a:Lcom/shungo/app/StartupActivity;

    return-void
.end method


# virtual methods
.method public final a(Lx2/d;)V
    .locals 2

    sget v0, Lcom/shungo/app/StartupActivity;->y:I

    const-string v0, "this$0"

    iget-object v1, p0, Lu2/v;->a:Lcom/shungo/app/StartupActivity;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/shungo/app/MainActivity;

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Boolean;

    sget p1, Lcom/shungo/app/StartupActivity;->y:I

    iget-object p1, p0, Lu2/v;->a:Lcom/shungo/app/StartupActivity;

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu2/v;

    invoke-direct {v0, p1}, Lu2/v;-><init>(Lcom/shungo/app/StartupActivity;)V

    sget-object p1, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    sget-object p1, Ly2/q;->b:Lj/a;

    invoke-static {p1, v0}, Ly2/d;->b(Lj/a;Lx2/b;)V

    return-void
.end method
