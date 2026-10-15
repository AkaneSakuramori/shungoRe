.class public final Li/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/v0;
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public b:Le/j;

.field public c:Landroid/widget/ListAdapter;

.field public d:Ljava/lang/CharSequence;

.field public final synthetic e:Li/w0;


# direct methods
.method public constructor <init>(Li/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/q0;->e:Li/w0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Li/q0;->b:Le/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Li/q0;->d:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final c(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final dismiss()V
    .locals 1

    iget-object v0, p0, Li/q0;->b:Le/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/j;->h()V

    const/4 v0, 0x0

    iput-object v0, p0, Li/q0;->b:Le/j;

    :cond_0
    return-void
.end method

.method public final e(II)V
    .locals 5

    iget-object v0, p0, Li/q0;->c:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Le/i;

    iget-object v1, p0, Li/q0;->e:Li/w0;

    invoke-virtual {v1}, Li/w0;->getPopupContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Le/i;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Li/q0;->d:Ljava/lang/CharSequence;

    iget-object v3, v0, Le/i;->c:Ljava/lang/Object;

    if-eqz v2, :cond_1

    move-object v4, v3

    check-cast v4, Le/e;

    iput-object v2, v4, Le/e;->d:Ljava/lang/CharSequence;

    :cond_1
    iget-object v2, p0, Li/q0;->c:Landroid/widget/ListAdapter;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    check-cast v3, Le/e;

    iput-object v2, v3, Le/e;->g:Landroid/widget/ListAdapter;

    iput-object p0, v3, Le/e;->h:Landroid/content/DialogInterface$OnClickListener;

    iput v1, v3, Le/e;->j:I

    const/4 v1, 0x1

    iput-boolean v1, v3, Le/e;->i:Z

    invoke-virtual {v0}, Le/i;->a()Le/j;

    move-result-object v0

    iput-object v0, p0, Li/q0;->b:Le/j;

    iget-object v0, v0, Le/j;->g:Le/h;

    iget-object v0, v0, Le/h;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    invoke-static {v0, p1}, Li/o0;->d(Landroid/view/View;I)V

    invoke-static {v0, p2}, Li/o0;->c(Landroid/view/View;I)V

    iget-object p1, p0, Li/q0;->b:Le/j;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final g(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Li/q0;->d:Ljava/lang/CharSequence;

    return-void
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set popup background for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final l(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set vertical offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final m()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n(Landroid/widget/ListAdapter;)V
    .locals 0

    iput-object p1, p0, Li/q0;->c:Landroid/widget/ListAdapter;

    return-void
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Li/q0;->e:Li/w0;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li/q0;->c:Landroid/widget/ListAdapter;

    invoke-interface {v0, p2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    invoke-virtual {p0}, Li/q0;->dismiss()V

    return-void
.end method

.method public final p(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
