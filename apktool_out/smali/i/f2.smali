.class public final Li/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Li/m2;


# direct methods
.method public synthetic constructor <init>(Li/m2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Li/f2;->b:I

    iput-object p1, p0, Li/f2;->c:Li/m2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Li/f2;->b:I

    iget-object v1, p0, Li/f2;->c:Li/m2;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Li/m2;->d:Li/z1;

    if-eqz v0, :cond_0

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/h0;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Li/m2;->d:Li/z1;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget-object v2, v1, Li/m2;->d:Li/z1;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-le v0, v2, :cond_0

    iget-object v0, v1, Li/m2;->d:Li/z1;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget v2, v1, Li/m2;->n:I

    if-gt v0, v2, :cond_0

    iget-object v0, v1, Li/m2;->A:Li/g0;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v1}, Li/m2;->h()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, v1, Li/m2;->d:Li/z1;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li/z1;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
