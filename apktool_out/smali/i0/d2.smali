.class public abstract Li0/d2;
.super Lf2/e;
.source "SourceFile"


# instance fields
.field public final d:Landroid/view/Window;

.field public final e:Le/n0;


# direct methods
.method public constructor <init>(Landroid/view/Window;Le/n0;)V
    .locals 1

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lf2/e;-><init>(I)V

    iput-object p1, p0, Li0/d2;->d:Landroid/view/Window;

    iput-object p2, p0, Li0/d2;->e:Le/n0;

    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_4

    const/16 v2, 0x8

    and-int v3, v2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Li0/d2;->e:Le/n0;

    iget-object v2, v2, Le/n0;->c:Ljava/lang/Object;

    check-cast v2, Lf2/e;

    invoke-virtual {v2}, Lf2/e;->P()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, Li0/d2;->T(I)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Li0/d2;->T(I)V

    iget-object v2, p0, Li0/d2;->d:Landroid/view/Window;

    const/16 v3, 0x400

    invoke-virtual {v2, v3}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final T(I)V
    .locals 2

    iget-object v0, p0, Li0/d2;->d:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
