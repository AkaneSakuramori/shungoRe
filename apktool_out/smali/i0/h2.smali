.class public final Li0/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf2/e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Le/n0;

    const/16 v1, 0xd

    invoke-direct {v0, p2, v1}, Le/n0;-><init>(Landroid/view/View;I)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 5
    new-instance p2, Li0/g2;

    .line 6
    invoke-static {p1}, Li0/x;->l(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v1

    invoke-direct {p2, v1, v0}, Li0/g2;-><init>(Landroid/view/WindowInsetsController;Le/n0;)V

    iput-object p1, p2, Li0/g2;->f:Landroid/view/Window;

    iput-object p2, p0, Li0/h2;->a:Lf2/e;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p2, Li0/f2;

    .line 8
    invoke-direct {p2, p1, v0}, Li0/d2;-><init>(Landroid/view/Window;Le/n0;)V

    iput-object p2, p0, Li0/h2;->a:Lf2/e;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Li0/g2;

    new-instance v1, Le/n0;

    invoke-direct {v1, p1}, Le/n0;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, Li0/g2;-><init>(Landroid/view/WindowInsetsController;Le/n0;)V

    iput-object v0, p0, Li0/h2;->a:Lf2/e;

    return-void
.end method
