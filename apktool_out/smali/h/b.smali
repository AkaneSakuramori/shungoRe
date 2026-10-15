.class public final Lh/b;
.super Li/c2;
.source "SourceFile"


# instance fields
.field public final synthetic k:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 0

    iput-object p1, p0, Lh/b;->k:Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-direct {p0, p1}, Li/c2;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lh/g0;
    .locals 2

    iget-object v0, p0, Lh/b;->k:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:Lh/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Li/i;

    iget-object v0, v0, Li/i;->a:Li/m;

    iget-object v0, v0, Li/m;->u:Li/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/a0;->a()Lh/x;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Lh/b;->k:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Lh/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->i:Lh/q;

    invoke-interface {v1, v0}, Lh/n;->e(Lh/q;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh/b;->b()Lh/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh/g0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method
