.class public final Lcom/google/android/material/datepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/datepicker/t;

.field public final synthetic d:Lcom/google/android/material/datepicker/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/t;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/android/material/datepicker/f;->b:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->d:Lcom/google/android/material/datepicker/l;

    iput-object p2, p0, Lcom/google/android/material/datepicker/f;->c:Lcom/google/android/material/datepicker/t;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/4 p1, 0x2

    iget v0, p0, Lcom/google/android/material/datepicker/f;->b:I

    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->c:Lcom/google/android/material/datepicker/t;

    iget-object v2, p0, Lcom/google/android/material/datepicker/f;->d:Lcom/google/android/material/datepicker/l;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lcom/google/android/material/datepicker/l;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ly0/o0;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Ly0/o0;->v()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ly0/o0;->F(Landroid/view/View;)I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    iget-object v3, v2, Lcom/google/android/material/datepicker/l;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ly0/g0;

    move-result-object v3

    invoke-virtual {v3}, Ly0/g0;->a()I

    move-result v3

    if-ge v0, v3, :cond_1

    iget-object v1, v1, Lcom/google/android/material/datepicker/t;->c:Lcom/google/android/material/datepicker/c;

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->b:Lcom/google/android/material/datepicker/p;

    iget-object v1, v1, Lcom/google/android/material/datepicker/p;->b:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/Calendar;->add(II)V

    new-instance p1, Lcom/google/android/material/datepicker/p;

    invoke-direct {p1, v1}, Lcom/google/android/material/datepicker/p;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {v2, p1}, Lcom/google/android/material/datepicker/l;->G(Lcom/google/android/material/datepicker/p;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, v2, Lcom/google/android/material/datepicker/l;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ly0/o0;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    iget-object v1, v1, Lcom/google/android/material/datepicker/t;->c:Lcom/google/android/material/datepicker/c;

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->b:Lcom/google/android/material/datepicker/p;

    iget-object v1, v1, Lcom/google/android/material/datepicker/p;->b:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/Calendar;->add(II)V

    new-instance p1, Lcom/google/android/material/datepicker/p;

    invoke-direct {p1, v1}, Lcom/google/android/material/datepicker/p;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {v2, p1}, Lcom/google/android/material/datepicker/l;->G(Lcom/google/android/material/datepicker/p;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
