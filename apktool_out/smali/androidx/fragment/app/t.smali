.class public final Landroidx/fragment/app/t;
.super Lc3/h;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r0;
.implements Landroidx/activity/a0;
.implements Landroidx/activity/result/h;
.implements Landroidx/fragment/app/l0;


# instance fields
.field public final j:Landroid/app/Activity;

.field public final k:Landroid/content/Context;

.field public final l:Landroid/os/Handler;

.field public final m:Landroidx/fragment/app/i0;

.field public final synthetic n:Landroidx/fragment/app/u;


# direct methods
.method public constructor <init>(Le/m;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Landroidx/fragment/app/i0;

    invoke-direct {v1}, Landroidx/fragment/app/i0;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    iput-object p1, p0, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    iput-object p1, p0, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    iput-object v0, p0, Landroidx/fragment/app/t;->l:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final F1(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final J1()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()Landroidx/lifecycle/q0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {v0}, Landroidx/activity/n;->h()Landroidx/lifecycle/q0;

    move-result-object v0

    return-object v0
.end method

.method public final t()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    iget-object v0, v0, Landroidx/fragment/app/u;->s:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
