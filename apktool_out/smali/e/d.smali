.class public final Le/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le/d;->b:I

    iput-object p1, p0, Le/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Le/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    iget p1, p0, Le/d;->b:I

    iget-object p4, p0, Le/d;->d:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast p4, Li/t0;

    iget-object p1, p4, Li/t0;->H:Li/w0;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-object p1, p4, Li/t0;->H:Li/w0;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p5

    if-eqz p5, :cond_0

    iget-object p5, p4, Li/t0;->E:Landroid/widget/ListAdapter;

    invoke-interface {p5, p3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    invoke-virtual {p4}, Li/m2;->dismiss()V

    return-void

    :pswitch_0
    check-cast p4, Le/e;

    iget-object p1, p4, Le/e;->h:Landroid/content/DialogInterface$OnClickListener;

    iget-object p2, p0, Le/d;->c:Ljava/lang/Object;

    check-cast p2, Le/h;

    iget-object p5, p2, Le/h;->b:Le/j;

    invoke-interface {p1, p5, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-boolean p1, p4, Le/e;->i:Z

    if-nez p1, :cond_1

    iget-object p1, p2, Le/h;->b:Le/j;

    invoke-virtual {p1}, Le/j;->h()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
