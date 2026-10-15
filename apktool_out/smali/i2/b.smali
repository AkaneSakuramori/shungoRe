.class public final synthetic Li2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li2/o;


# direct methods
.method public synthetic constructor <init>(Li2/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Li2/b;->a:I

    iput-object p1, p0, Li2/b;->b:Li2/o;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget p1, p0, Li2/b;->a:I

    iget-object v0, p0, Li2/b;->b:Li2/o;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Li2/k;

    iput-boolean p2, v0, Li2/k;->l:Z

    invoke-virtual {v0}, Li2/o;->q()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Li2/k;->t(Z)V

    iput-boolean p1, v0, Li2/k;->m:Z

    :cond_0
    return-void

    :pswitch_0
    check-cast v0, Li2/d;

    invoke-virtual {v0}, Li2/d;->u()Z

    move-result p1

    invoke-virtual {v0, p1}, Li2/d;->t(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
