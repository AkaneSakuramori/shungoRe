.class public final Li0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Li/a0;

.field public final synthetic d:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/view/View;Li0/o1;Li/a0;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/i1;->b:Landroid/view/View;

    iput-object p3, p0, Li0/i1;->c:Li/a0;

    iput-object p4, p0, Li0/i1;->d:Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li0/i1;->c:Li/a0;

    iget-object v1, p0, Li0/i1;->b:Landroid/view/View;

    invoke-static {v1, v0}, Li0/k1;->h(Landroid/view/View;Li/a0;)V

    iget-object v0, p0, Li0/i1;->d:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
