.class public final Le/q0;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Le/s0;


# direct methods
.method public synthetic constructor <init>(Le/s0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le/q0;->j:I

    iput-object p1, p0, Le/q0;->k:Le/s0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget v0, p0, Le/q0;->j:I

    iget-object v1, p0, Le/q0;->k:Le/s0;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iput-object v2, v1, Le/s0;->B:Lg/n;

    iget-object v0, v1, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_0
    iget-boolean v0, v1, Le/s0;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, v1, Le/s0;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, v1, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object v0, v1, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object v0, v1, Le/s0;->m:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iput-object v2, v1, Le/s0;->B:Lg/n;

    iget-object v0, v1, Le/s0;->t:Lg/b;

    if-eqz v0, :cond_1

    iget-object v3, v1, Le/s0;->s:Le/r0;

    invoke-interface {v0, v3}, Lg/b;->b(Lg/c;)V

    iput-object v2, v1, Le/s0;->s:Le/r0;

    iput-object v2, v1, Le/s0;->t:Lg/b;

    :cond_1
    iget-object v0, v1, Le/s0;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_2

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/i0;->c(Landroid/view/View;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
