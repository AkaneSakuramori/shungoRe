.class public abstract Landroidx/fragment/app/u;
.super Landroidx/activity/n;
.source "SourceFile"

# interfaces
.implements Ly/c;
.implements Ly/d;


# instance fields
.field public final r:Landroidx/fragment/app/k;

.field public final s:Landroidx/lifecycle/t;

.field public t:Z

.field public u:Z

.field public v:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/activity/n;-><init>()V

    new-instance v0, Landroidx/fragment/app/t;

    move-object v1, p0

    check-cast v1, Le/m;

    invoke-direct {v0, v1}, Landroidx/fragment/app/t;-><init>(Le/m;)V

    new-instance v2, Landroidx/fragment/app/k;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0}, Landroidx/fragment/app/k;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/u;->v:Z

    iget-object v0, p0, Landroidx/activity/n;->f:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    new-instance v2, Landroidx/fragment/app/r;

    invoke-direct {v2, v1}, Landroidx/fragment/app/r;-><init>(Le/m;)V

    const-string v3, "android:support:fragments"

    invoke-virtual {v0, v3, v2}, Lz0/e;->b(Ljava/lang/String;Lz0/d;)V

    new-instance v0, Landroidx/fragment/app/s;

    invoke-direct {v0, v1}, Landroidx/fragment/app/s;-><init>(Le/m;)V

    invoke-virtual {p0, v0}, Landroidx/activity/n;->i(Lb/b;)V

    return-void
.end method

.method public static k(Landroidx/fragment/app/i0;)Z
    .locals 5

    iget-object p0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {p0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/q;->f()Landroidx/fragment/app/i0;

    move-result-object v2

    invoke-static {v2}, Landroidx/fragment/app/u;->k(Landroidx/fragment/app/i0;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    sget-object v3, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/z0;->c()V

    iget-object v2, v2, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    iget-object v2, v2, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_4

    iget-object v0, v1, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    iget-object v0, v0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    move v0, v4

    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/q;->N:Landroidx/lifecycle/t;

    iget-object v2, v2, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/q;->N:Landroidx/lifecycle/t;

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    move v0, v4

    goto :goto_0

    :cond_5
    return v0
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/u;->t:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/u;->u:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/u;->v:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lv0/b;

    invoke-interface {p0}, Landroidx/lifecycle/r0;->h()Landroidx/lifecycle/q0;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lv0/b;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q0;)V

    invoke-virtual {v1, v0, p3}, Lv0/b;->Q2(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/i0;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0, p1}, Landroidx/activity/n;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i0;->h(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/activity/n;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    iget-object p1, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object p1, p1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v0, p1, Landroidx/fragment/app/i0;->B:Z

    iget-object v1, p1, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v0, v1, Landroidx/fragment/app/k0;->h:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i0;->s(I)V

    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/activity/n;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    iget-object p1, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object p1, p1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {p1}, Landroidx/fragment/app/i0;->j()Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/n;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    return v0
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    .line 1
    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    .line 2
    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    .line 3
    iget-object v0, v0, Landroidx/fragment/app/i0;->f:Landroidx/fragment/app/a0;

    .line 4
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    .line 6
    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    .line 7
    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    .line 8
    iget-object v0, v0, Landroidx/fragment/app/i0;->f:Landroidx/fragment/app/a0;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/fragment/app/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->k()V

    iget-object v0, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->l()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/activity/n;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p2, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {p1}, Landroidx/fragment/app/i0;->i()Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p2, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {p1}, Landroidx/fragment/app/i0;->n()Z

    move-result p1

    return p1
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i0;->m(Z)V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0, p1}, Landroidx/activity/n;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->o()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/n;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/u;->u:Z

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i0;->q(Z)V

    return-void
.end method

.method public onPostResume()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    iget-object v0, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v1, v0, Landroidx/fragment/app/i0;->B:Z

    iget-object v2, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v1, v2, Landroidx/fragment/app/k0;->h:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->s(I)V

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object p1, p1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {p1}, Landroidx/fragment/app/i0;->r()Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    return v0
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/n;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public final onResume()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/u;->u:Z

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->x(Z)Z

    return-void
.end method

.method public onStart()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/u;->v:Z

    iget-boolean v2, p0, Landroidx/fragment/app/u;->t:Z

    const/4 v3, 0x1

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    if-nez v2, :cond_0

    iput-boolean v3, p0, Landroidx/fragment/app/u;->t:Z

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/t;

    iget-object v2, v2, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    iput-boolean v1, v2, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v1, v2, Landroidx/fragment/app/i0;->B:Z

    iget-object v4, v2, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v1, v4, Landroidx/fragment/app/k0;->h:Z

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Landroidx/fragment/app/i0;->s(I)V

    :cond_0
    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/t;

    iget-object v2, v2, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/i0;->x(Z)Z

    iget-object v2, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    iput-boolean v1, v0, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v1, v0, Landroidx/fragment/app/i0;->B:Z

    iget-object v2, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v1, v2, Landroidx/fragment/app/k0;->h:Z

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->s(I)V

    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/u;->v:Z

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/u;->r:Landroidx/fragment/app/k;

    iget-object v2, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/t;

    iget-object v2, v2, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-static {v2}, Landroidx/fragment/app/u;->k(Landroidx/fragment/app/i0;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    iput-boolean v0, v1, Landroidx/fragment/app/i0;->B:Z

    iget-object v2, v1, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v0, v2, Landroidx/fragment/app/k0;->h:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroidx/fragment/app/i0;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/l;)V

    return-void
.end method
