.class public final Lv1/b;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv1/b;->j:I

    iput-object p2, p0, Lv1/b;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final G1(I)V
    .locals 1

    iget p1, p0, Lv1/b;->j:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lv1/b;->k:Ljava/lang/Object;

    check-cast p1, Lz1/i;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lz1/i;->d:Z

    iget-object p1, p1, Lz1/i;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/h;

    if-eqz p1, :cond_0

    check-cast p1, Lv1/f;

    invoke-virtual {p1}, Lv1/f;->v()V

    invoke-virtual {p1}, Lf2/h;->invalidateSelf()V

    :cond_0
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final I1(Landroid/graphics/Typeface;Z)V
    .locals 1

    iget p1, p0, Lv1/b;->j:I

    iget-object v0, p0, Lv1/b;->k:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Lz1/i;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz1/i;->d:Z

    iget-object p1, v0, Lz1/i;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/h;

    if-eqz p1, :cond_1

    check-cast p1, Lv1/f;

    invoke-virtual {p1}, Lv1/f;->v()V

    invoke-virtual {p1}, Lf2/h;->invalidateSelf()V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget-object p1, v0, Lcom/google/android/material/chip/Chip;->f:Lv1/f;

    iget-boolean p2, p1, Lv1/f;->E0:Z

    if-eqz p2, :cond_2

    iget-object p1, p1, Lv1/f;->F:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
