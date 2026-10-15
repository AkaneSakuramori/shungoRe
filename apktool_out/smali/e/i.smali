.class public final Le/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/b0;


# instance fields
.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le/i;->b:I

    iput-object p2, p0, Le/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    .line 3
    invoke-static {p1, v0}, Le/j;->p(Landroid/content/Context;I)I

    move-result v0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v1, Le/e;

    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 6
    invoke-static {p1, v0}, Le/j;->p(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Le/e;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v1, p0, Le/i;->c:Ljava/lang/Object;

    iput v0, p0, Le/i;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/i;->c:Ljava/lang/Object;

    iput p2, p0, Le/i;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Le/j;
    .locals 11

    new-instance v0, Le/j;

    iget-object v1, p0, Le/i;->c:Ljava/lang/Object;

    check-cast v1, Le/e;

    iget-object v2, v1, Le/e;->a:Landroid/content/Context;

    iget v3, p0, Le/i;->b:I

    invoke-direct {v0, v2, v3}, Le/j;-><init>(Landroid/content/Context;I)V

    iget-object v2, v1, Le/e;->e:Landroid/view/View;

    iget-object v3, v0, Le/j;->g:Le/h;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iput-object v2, v3, Le/h;->o:Landroid/view/View;

    goto :goto_0

    :cond_0
    iget-object v2, v1, Le/e;->d:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    iput-object v2, v3, Le/h;->d:Ljava/lang/CharSequence;

    iget-object v5, v3, Le/h;->m:Landroid/widget/TextView;

    if-eqz v5, :cond_1

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v2, v1, Le/e;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    iput-object v2, v3, Le/h;->k:Landroid/graphics/drawable/Drawable;

    iput v4, v3, Le/h;->j:I

    iget-object v5, v3, Le/h;->l:Landroid/widget/ImageView;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v5, v3, Le/h;->l:Landroid/widget/ImageView;

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    iget-object v2, v1, Le/e;->g:Landroid/widget/ListAdapter;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_7

    iget v2, v3, Le/h;->s:I

    iget-object v7, v1, Le/e;->b:Landroid/view/LayoutInflater;

    invoke-virtual {v7, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget-boolean v7, v1, Le/e;->i:Z

    if-eqz v7, :cond_3

    iget v7, v3, Le/h;->t:I

    goto :goto_1

    :cond_3
    iget v7, v3, Le/h;->u:I

    :goto_1
    iget-object v8, v1, Le/e;->g:Landroid/widget/ListAdapter;

    if-eqz v8, :cond_4

    goto :goto_2

    :cond_4
    new-instance v8, Le/g;

    iget-object v9, v1, Le/e;->a:Landroid/content/Context;

    const v10, 0x1020014

    invoke-direct {v8, v9, v7, v10, v6}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    :goto_2
    iput-object v8, v3, Le/h;->p:Landroid/widget/ListAdapter;

    iget v7, v1, Le/e;->j:I

    iput v7, v3, Le/h;->q:I

    iget-object v7, v1, Le/e;->h:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v7, :cond_5

    new-instance v7, Le/d;

    invoke-direct {v7, v1, v4, v3}, Le/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_5
    iget-boolean v4, v1, Le/e;->i:Z

    if-eqz v4, :cond_6

    invoke-virtual {v2, v5}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    :cond_6
    iput-object v2, v3, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v1, Le/e;->f:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_8

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_8
    return-object v0
.end method

.method public final b()Z
    .locals 2

    iget v0, p0, Le/i;->b:I

    iget-object v1, p0, Le/i;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Le/i;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v0, p0, Le/i;->b:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    const/4 p1, 0x1

    return p1
.end method
