.class public Li0/r1;
.super Li0/t1;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Li0/t1;-><init>()V

    .line 2
    invoke-static {}, Landroidx/lifecycle/e0;->e()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Li0/c2;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Li0/t1;-><init>(Li0/c2;)V

    .line 4
    invoke-virtual {p1}, Li0/c2;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Landroidx/lifecycle/e0;->f(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Landroidx/lifecycle/e0;->e()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Li0/c2;
    .locals 3

    invoke-virtual {p0}, Li0/t1;->a()V

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, Landroidx/lifecycle/e0;->g(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object v0

    iget-object v1, p0, Li0/t1;->b:[Lb0/c;

    iget-object v2, v0, Li0/c2;->a:Li0/a2;

    invoke-virtual {v2, v1}, Li0/a2;->o([Lb0/c;)V

    return-object v0
.end method

.method public d(Lb0/c;)V
    .locals 1

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/e0;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(Lb0/c;)V
    .locals 1

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/e0;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(Lb0/c;)V
    .locals 1

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/e0;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(Lb0/c;)V
    .locals 1

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/e0;->x(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(Lb0/c;)V
    .locals 1

    iget-object v0, p0, Li0/r1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/e0;->o(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
