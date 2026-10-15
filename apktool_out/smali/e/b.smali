.class public final Le/b;
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

    iput p1, p0, Le/b;->b:I

    iput-object p2, p0, Le/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    const/4 p1, 0x1

    iget v0, p0, Le/b;->b:I

    iget-object v1, p0, Le/b;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/android/material/datepicker/l;

    iget v0, v1, Lcom/google/android/material/datepicker/l;->X:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/l;->H(I)V

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    invoke-virtual {v1, v2}, Lcom/google/android/material/datepicker/l;->H(I)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    iget-object p1, v1, Landroidx/appcompat/widget/Toolbar;->M:Li/t3;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    iget-object p1, p1, Li/t3;->c:Lh/q;

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh/q;->collapseActionView()Z

    :cond_3
    return-void

    :pswitch_1
    check-cast v1, Le/h;

    iget-object v0, v1, Le/h;->f:Landroid/widget/Button;

    iget-object v0, v1, Le/h;->w:Le/f;

    iget-object v1, v1, Le/h;->b:Le/j;

    invoke-virtual {v0, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
