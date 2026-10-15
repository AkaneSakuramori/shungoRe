.class public final Lh/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh/c0;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/LayoutInflater;

.field public d:Lh/o;

.field public e:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public f:Lh/b0;

.field public g:Lh/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/k;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lh/k;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final b(Lh/o;Z)V
    .locals 1

    iget-object v0, p0, Lh/k;->f:Lh/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lh/b0;->b(Lh/o;Z)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lh/k;->g:Lh/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/j;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final d(Lh/q;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final e(Lh/b0;)V
    .locals 0

    iput-object p1, p0, Lh/k;->f:Lh/b0;

    return-void
.end method

.method public final g(Landroid/content/Context;Lh/o;)V
    .locals 1

    iget-object v0, p0, Lh/k;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lh/k;->b:Landroid/content/Context;

    iget-object v0, p0, Lh/k;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lh/k;->c:Landroid/view/LayoutInflater;

    :cond_0
    iput-object p2, p0, Lh/k;->d:Lh/o;

    iget-object p1, p0, Lh/k;->g:Lh/j;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lh/j;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lh/i0;)Z
    .locals 7

    invoke-virtual {p1}, Lh/o;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lh/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lh/p;->b:Lh/o;

    new-instance v1, Le/i;

    iget-object v2, p1, Lh/o;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Le/i;-><init>(Landroid/content/Context;)V

    new-instance v3, Lh/k;

    iget-object v4, v1, Le/i;->c:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Le/e;

    iget-object v6, v5, Le/e;->a:Landroid/content/Context;

    invoke-direct {v3, v6}, Lh/k;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, Lh/p;->d:Lh/k;

    iput-object v0, v3, Lh/k;->f:Lh/b0;

    invoke-virtual {p1, v3, v2}, Lh/o;->b(Lh/c0;Landroid/content/Context;)V

    iget-object v2, v0, Lh/p;->d:Lh/k;

    iget-object v3, v2, Lh/k;->g:Lh/j;

    if-nez v3, :cond_1

    new-instance v3, Lh/j;

    invoke-direct {v3, v2}, Lh/j;-><init>(Lh/k;)V

    iput-object v3, v2, Lh/k;->g:Lh/j;

    :cond_1
    iget-object v2, v2, Lh/k;->g:Lh/j;

    iput-object v2, v5, Le/e;->g:Landroid/widget/ListAdapter;

    iput-object v0, v5, Le/e;->h:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p1, Lh/o;->o:Landroid/view/View;

    if-eqz v2, :cond_2

    iput-object v2, v5, Le/e;->e:Landroid/view/View;

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lh/o;->n:Landroid/graphics/drawable/Drawable;

    iput-object v2, v5, Le/e;->c:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lh/o;->m:Ljava/lang/CharSequence;

    check-cast v4, Le/e;

    iput-object v2, v4, Le/e;->d:Ljava/lang/CharSequence;

    :goto_0
    iput-object v0, v5, Le/e;->f:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v1}, Le/i;->a()Le/j;

    move-result-object v1

    iput-object v1, v0, Lh/p;->c:Le/j;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lh/p;->c:Le/j;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lh/p;->c:Le/j;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lh/k;->f:Lh/b0;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lh/b0;->k(Lh/o;)Z

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final k(Lh/q;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lh/k;->d:Lh/o;

    iget-object p2, p0, Lh/k;->g:Lh/j;

    invoke-virtual {p2, p3}, Lh/j;->b(I)Lh/q;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lh/o;->q(Landroid/view/MenuItem;Lh/c0;I)Z

    return-void
.end method
