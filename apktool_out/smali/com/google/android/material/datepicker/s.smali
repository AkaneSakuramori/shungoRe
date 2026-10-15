.class public final Lcom/google/android/material/datepicker/s;
.super Ly0/d1;
.source "SourceFile"


# instance fields
.field public final t:Landroid/widget/TextView;

.field public final u:Lcom/google/android/material/datepicker/MaterialCalendarGridView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Z)V
    .locals 4

    invoke-direct {p0, p1}, Ly0/d1;-><init>(Landroid/view/View;)V

    const v0, 0x7f080119

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/android/material/datepicker/s;->t:Landroid/widget/TextView;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    new-instance v1, Li0/a0;

    const/4 v2, 0x3

    const v3, 0x7f0801b7

    invoke-direct {v1, v3, v2}, Li0/a0;-><init>(II)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Li0/c0;->b(Landroid/view/View;Ljava/lang/Object;)V

    const v1, 0x7f080114

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    iput-object p1, p0, Lcom/google/android/material/datepicker/s;->u:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    if-nez p2, :cond_0

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
