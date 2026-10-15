.class public final synthetic Lcom/google/android/material/datepicker/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/material/datepicker/m;->b:I

    iput-object p2, p0, Lcom/google/android/material/datepicker/m;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, Lcom/google/android/material/datepicker/m;->b:I

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->c:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v1, Li2/u;

    iget-object p1, v1, Li2/u;->f:Landroid/widget/EditText;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result p1

    iget-object v2, v1, Li2/u;->f:Landroid/widget/EditText;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v2, :cond_1

    iget-object v2, v1, Li2/u;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_0

    :cond_1
    iget-object v0, v1, Li2/u;->f:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :goto_0
    if-ltz p1, :cond_2

    iget-object v0, v1, Li2/u;->f:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_2
    invoke-virtual {v1}, Li2/o;->q()V

    :goto_1
    return-void

    :pswitch_0
    check-cast v1, Li2/k;

    invoke-virtual {v1}, Li2/k;->u()V

    return-void

    :pswitch_1
    check-cast v1, Li2/d;

    iget-object p1, v1, Li2/d;->i:Landroid/widget/EditText;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    :cond_4
    invoke-virtual {v1}, Li2/o;->q()V

    :goto_2
    return-void

    :pswitch_2
    check-cast v1, Lcom/google/android/material/datepicker/n;

    sget p1, Lcom/google/android/material/datepicker/n;->G0:I

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/n;->I()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
