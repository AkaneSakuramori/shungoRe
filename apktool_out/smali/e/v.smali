.class public final Le/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b;


# instance fields
.field public final b:Lg/b;

.field public final synthetic c:Le/e0;


# direct methods
.method public constructor <init>(Le/e0;Lg/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/v;->c:Le/e0;

    iput-object p2, p0, Le/v;->b:Lg/b;

    return-void
.end method


# virtual methods
.method public final a(Lg/c;Lh/o;)Z
    .locals 2

    iget-object v0, p0, Le/v;->c:Le/e0;

    iget-object v0, v0, Le/e0;->B:Landroid/view/ViewGroup;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/i0;->c(Landroid/view/View;)V

    iget-object v0, p0, Le/v;->b:Lg/b;

    invoke-interface {v0, p1, p2}, Lg/b;->a(Lg/c;Lh/o;)Z

    move-result p1

    return p1
.end method

.method public final b(Lg/c;)V
    .locals 3

    iget-object v0, p0, Le/v;->b:Lg/b;

    invoke-interface {v0, p1}, Lg/b;->b(Lg/c;)V

    iget-object p1, p0, Le/v;->c:Le/e0;

    iget-object v0, p1, Le/e0;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p1, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, Le/e0;->y:Le/s;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p1, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p1, Le/e0;->z:Li0/d1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li0/d1;->b()V

    :cond_1
    iget-object v0, p1, Le/e0;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Li0/v0;->a(Landroid/view/View;)Li0/d1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li0/d1;->a(F)V

    iput-object v0, p1, Le/e0;->z:Li0/d1;

    new-instance v1, Le/u;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Le/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Li0/d1;->d(Li0/e1;)V

    :cond_2
    iget-object v0, p1, Le/e0;->o:Le/n;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Le/n;->c()V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p1, Le/e0;->v:Lg/c;

    iget-object v0, p1, Le/e0;->B:Landroid/view/ViewGroup;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/i0;->c(Landroid/view/View;)V

    invoke-virtual {p1}, Le/e0;->I()V

    return-void
.end method

.method public final c(Lg/c;Lh/o;)Z
    .locals 1

    iget-object v0, p0, Le/v;->b:Lg/b;

    invoke-interface {v0, p1, p2}, Lg/b;->c(Lg/c;Lh/o;)Z

    move-result p1

    return p1
.end method

.method public final f(Lg/c;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Le/v;->b:Lg/b;

    invoke-interface {v0, p1, p2}, Lg/b;->f(Lg/c;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
