.class public abstract Lr/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lr/k;->a:[Z

    return-void
.end method

.method public static a(Lr/e;Lp/d;Lr/d;)V
    .locals 8

    const/4 v0, -0x1

    iput v0, p2, Lr/d;->o:I

    iput v0, p2, Lr/d;->p:I

    iget-object v0, p0, Lr/d;->p0:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v2, p2, Lr/d;->p0:[I

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eq v0, v3, :cond_0

    aget v0, v2, v1

    if-ne v0, v4, :cond_0

    iget-object v0, p2, Lr/d;->I:Lr/c;

    iget v1, v0, Lr/c;->g:I

    invoke-virtual {p0}, Lr/d;->r()I

    move-result v5

    iget-object v6, p2, Lr/d;->K:Lr/c;

    iget v7, v6, Lr/c;->g:I

    sub-int/2addr v5, v7

    invoke-virtual {p1, v0}, Lp/d;->k(Ljava/lang/Object;)Lp/i;

    move-result-object v7

    iput-object v7, v0, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v6}, Lp/d;->k(Ljava/lang/Object;)Lp/i;

    move-result-object v7

    iput-object v7, v6, Lr/c;->i:Lp/i;

    iget-object v0, v0, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v0, v1}, Lp/d;->d(Lp/i;I)V

    iget-object v0, v6, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v0, v5}, Lp/d;->d(Lp/i;I)V

    iput v3, p2, Lr/d;->o:I

    iput v1, p2, Lr/d;->Y:I

    sub-int/2addr v5, v1

    iput v5, p2, Lr/d;->U:I

    iget v0, p2, Lr/d;->b0:I

    if-ge v5, v0, :cond_0

    iput v0, p2, Lr/d;->U:I

    :cond_0
    iget-object v0, p0, Lr/d;->p0:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    if-eq v0, v3, :cond_3

    aget v0, v2, v1

    if-ne v0, v4, :cond_3

    iget-object v0, p2, Lr/d;->J:Lr/c;

    iget v1, v0, Lr/c;->g:I

    invoke-virtual {p0}, Lr/d;->l()I

    move-result p0

    iget-object v2, p2, Lr/d;->L:Lr/c;

    iget v4, v2, Lr/c;->g:I

    sub-int/2addr p0, v4

    invoke-virtual {p1, v0}, Lp/d;->k(Ljava/lang/Object;)Lp/i;

    move-result-object v4

    iput-object v4, v0, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v2}, Lp/d;->k(Ljava/lang/Object;)Lp/i;

    move-result-object v4

    iput-object v4, v2, Lr/c;->i:Lp/i;

    iget-object v0, v0, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v0, v1}, Lp/d;->d(Lp/i;I)V

    iget-object v0, v2, Lr/c;->i:Lp/i;

    invoke-virtual {p1, v0, p0}, Lp/d;->d(Lp/i;I)V

    iget v0, p2, Lr/d;->a0:I

    if-gtz v0, :cond_1

    iget v0, p2, Lr/d;->g0:I

    const/16 v2, 0x8

    if-ne v0, v2, :cond_2

    :cond_1
    iget-object v0, p2, Lr/d;->M:Lr/c;

    invoke-virtual {p1, v0}, Lp/d;->k(Ljava/lang/Object;)Lp/i;

    move-result-object v2

    iput-object v2, v0, Lr/c;->i:Lp/i;

    iget v0, p2, Lr/d;->a0:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v2, v0}, Lp/d;->d(Lp/i;I)V

    :cond_2
    iput v3, p2, Lr/d;->p:I

    iput v1, p2, Lr/d;->Z:I

    sub-int/2addr p0, v1

    iput p0, p2, Lr/d;->V:I

    iget p1, p2, Lr/d;->c0:I

    if-ge p0, p1, :cond_3

    iput p1, p2, Lr/d;->V:I

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
