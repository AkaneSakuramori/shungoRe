.class public final Lg/i;
.super Landroid/view/ActionMode;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lg/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg/c;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lg/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lg/i;->b:Lg/c;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->a()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->b()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Lh/f0;

    iget-object v1, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v1}, Lg/c;->c()Lh/o;

    move-result-object v1

    iget-object v2, p0, Lg/i;->a:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Lh/f0;-><init>(Landroid/content/Context;Ld0/a;)V

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    iget-object v0, v0, Lg/c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    iget-boolean v0, v0, Lg/c;->c:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->i()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0}, Lg/c;->j()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0, p1}, Lg/c;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    .line 2
    invoke-virtual {v0, p1}, Lg/c;->l(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    .line 1
    invoke-virtual {v0, p1}, Lg/c;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    iput-object p1, v0, Lg/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    .line 2
    invoke-virtual {v0, p1}, Lg/c;->n(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    .line 1
    invoke-virtual {v0, p1}, Lg/c;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lg/i;->b:Lg/c;

    invoke-virtual {v0, p1}, Lg/c;->p(Z)V

    return-void
.end method
