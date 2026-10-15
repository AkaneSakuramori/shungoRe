.class public final Landroidx/fragment/app/w;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroidx/fragment/app/q;

.field public final synthetic d:Landroidx/fragment/app/b0;

.field public final synthetic e:Le0/e;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/q;Landroidx/fragment/app/b0;Le0/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/w;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Landroidx/fragment/app/w;->b:Landroid/view/View;

    iput-object p3, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/q;

    iput-object p4, p0, Landroidx/fragment/app/w;->d:Landroidx/fragment/app/b0;

    iput-object p5, p0, Landroidx/fragment/app/w;->e:Le0/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    iget-object p1, p0, Landroidx/fragment/app/w;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/w;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/q;

    iget-object v2, v1, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, v2, Landroidx/fragment/app/o;->b:Landroid/animation/Animator;

    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v4

    iput-object v3, v4, Landroidx/fragment/app/o;->b:Landroid/animation/Animator;

    if-eqz v2, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/w;->d:Landroidx/fragment/app/b0;

    iget-object v0, p0, Landroidx/fragment/app/w;->e:Le0/e;

    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/b0;->c(Landroidx/fragment/app/q;Le0/e;)V

    :cond_1
    return-void
.end method
