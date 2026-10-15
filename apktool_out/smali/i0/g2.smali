.class public final Li0/g2;
.super Lf2/e;
.source "SourceFile"


# instance fields
.field public final d:Landroid/view/WindowInsetsController;

.field public final e:Le/n0;

.field public f:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsController;Le/n0;)V
    .locals 1

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lf2/e;-><init>(I)V

    iput-object p1, p0, Li0/g2;->d:Landroid/view/WindowInsetsController;

    iput-object p2, p0, Li0/g2;->e:Le/n0;

    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 2

    iget-object v0, p0, Li0/g2;->f:Landroid/view/Window;

    iget-object v1, p0, Li0/g2;->d:Landroid/view/WindowInsetsController;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit8 v0, v0, 0x10

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    invoke-static {v1}, Li0/x;->q(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit8 v0, v0, -0x11

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    invoke-static {v1}, Li0/x;->v(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final N(Z)V
    .locals 2

    iget-object v0, p0, Li0/g2;->f:Landroid/view/Window;

    iget-object v1, p0, Li0/g2;->d:Landroid/view/WindowInsetsController;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit16 v0, v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    invoke-static {v1}, Li0/x;->x(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, -0x2001

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    invoke-static {v1}, Li0/x;->z(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final Q()V
    .locals 2

    iget-object v0, p0, Li0/g2;->e:Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lf2/e;

    invoke-virtual {v0}, Lf2/e;->P()V

    const/4 v0, 0x0

    iget-object v1, p0, Li0/g2;->d:Landroid/view/WindowInsetsController;

    invoke-static {v1, v0}, Li0/x;->r(Landroid/view/WindowInsetsController;I)V

    return-void
.end method
