.class public abstract Landroidx/activity/p;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Landroidx/activity/a0;
.implements Lz0/g;


# instance fields
.field public b:Landroidx/lifecycle/t;

.field public final c:Lz0/f;

.field public final d:Landroidx/activity/z;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lz0/c;->b(Lz0/g;)Lz0/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/activity/p;->c:Lz0/f;

    new-instance p1, Landroidx/activity/z;

    new-instance p2, Landroidx/activity/d;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Landroidx/activity/d;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, p2}, Landroidx/activity/z;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Landroidx/activity/p;->d:Landroidx/activity/z;

    return-void
.end method

.method public static a(Landroidx/activity/p;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public final e()Lz0/e;
    .locals 1

    iget-object v0, p0, Landroidx/activity/p;->c:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    return-object v0
.end method

.method public final f()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/activity/p;->b:Landroidx/lifecycle/t;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/activity/p;->b:Landroidx/lifecycle/t;

    :cond_0
    return-object v0
.end method

.method public final onBackPressed()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/p;->d:Landroidx/activity/z;

    invoke-virtual {v0}, Landroidx/activity/z;->b()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/activity/o;->f(Landroidx/activity/p;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    const-string v1, "onBackInvokedDispatcher"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/activity/p;->d:Landroidx/activity/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, v1, Landroidx/activity/z;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean v0, v1, Landroidx/activity/z;->g:Z

    invoke-virtual {v1, v0}, Landroidx/activity/z;->c(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/activity/p;->c:Lz0/f;

    invoke-virtual {v0, p1}, Lz0/f;->b(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/activity/p;->f()Landroidx/lifecycle/t;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "super.onSaveInstanceState()"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/activity/p;->c:Lz0/f;

    invoke-virtual {v1, v0}, Lz0/f;->c(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-virtual {p0}, Landroidx/activity/p;->f()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-virtual {p0}, Landroidx/activity/p;->f()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/activity/p;->b:Landroidx/lifecycle/t;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public final t()Landroidx/lifecycle/t;
    .locals 1

    invoke-virtual {p0}, Landroidx/activity/p;->f()Landroidx/lifecycle/t;

    move-result-object v0

    return-object v0
.end method
