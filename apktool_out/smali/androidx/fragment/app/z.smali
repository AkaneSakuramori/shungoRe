.class public final Landroidx/fragment/app/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/fragment/app/n0;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/a0;Landroidx/fragment/app/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/z;->b:I

    iput-object p1, p0, Landroidx/fragment/app/z;->d:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/z;->c:Landroidx/fragment/app/n0;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/n0;Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/z;->b:I

    iput-object p1, p0, Landroidx/fragment/app/z;->c:Landroidx/fragment/app/n0;

    iput-object p2, p0, Landroidx/fragment/app/z;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Landroidx/fragment/app/z;->b:I

    iget-object v0, p0, Landroidx/fragment/app/z;->d:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object p1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/i0;->c(Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Landroidx/fragment/app/z;->c:Landroidx/fragment/app/n0;

    iget-object v1, p1, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    invoke-virtual {p1}, Landroidx/fragment/app/n0;->k()V

    iget-object p1, v1, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    check-cast v0, Landroidx/fragment/app/a0;

    iget-object v0, v0, Landroidx/fragment/app/a0;->b:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->C()Landroidx/fragment/app/b0;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/fragment/app/d1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/b0;)Landroidx/fragment/app/d1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/d1;->e()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
