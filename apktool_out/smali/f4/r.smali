.class public final Lf4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Z

.field public f:Lf4/r;

.field public g:Lf4/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lf4/r;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf4/r;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf4/r;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/r;->a:[B

    iput p2, p0, Lf4/r;->b:I

    iput p3, p0, Lf4/r;->c:I

    iput-boolean p4, p0, Lf4/r;->d:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf4/r;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lf4/r;
    .locals 4

    iget-object v0, p0, Lf4/r;->f:Lf4/r;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lf4/r;->g:Lf4/r;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, p0, Lf4/r;->f:Lf4/r;

    iput-object v3, v2, Lf4/r;->f:Lf4/r;

    iget-object v2, p0, Lf4/r;->f:Lf4/r;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, p0, Lf4/r;->g:Lf4/r;

    iput-object v3, v2, Lf4/r;->g:Lf4/r;

    iput-object v1, p0, Lf4/r;->f:Lf4/r;

    iput-object v1, p0, Lf4/r;->g:Lf4/r;

    return-object v0
.end method

.method public final b(Lf4/r;)V
    .locals 1

    iput-object p0, p1, Lf4/r;->g:Lf4/r;

    iget-object v0, p0, Lf4/r;->f:Lf4/r;

    iput-object v0, p1, Lf4/r;->f:Lf4/r;

    iget-object v0, p0, Lf4/r;->f:Lf4/r;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iput-object p1, v0, Lf4/r;->g:Lf4/r;

    iput-object p1, p0, Lf4/r;->f:Lf4/r;

    return-void
.end method

.method public final c()Lf4/r;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf4/r;->d:Z

    new-instance v1, Lf4/r;

    iget v2, p0, Lf4/r;->b:I

    iget v3, p0, Lf4/r;->c:I

    iget-object v4, p0, Lf4/r;->a:[B

    invoke-direct {v1, v4, v2, v3, v0}, Lf4/r;-><init>([BIIZ)V

    return-object v1
.end method

.method public final d(Lf4/r;I)V
    .locals 5

    iget-boolean v0, p1, Lf4/r;->e:Z

    if-eqz v0, :cond_3

    iget v0, p1, Lf4/r;->c:I

    add-int v1, v0, p2

    iget-object v2, p1, Lf4/r;->a:[B

    const/16 v3, 0x2000

    if-le v1, v3, :cond_2

    iget-boolean v4, p1, Lf4/r;->d:Z

    if-nez v4, :cond_1

    iget v4, p1, Lf4/r;->b:I

    sub-int/2addr v1, v4

    if-gt v1, v3, :cond_0

    const/4 v1, 0x0

    invoke-static {v1, v4, v0, v2, v2}, La3/j;->S2(III[B[B)V

    iget v0, p1, Lf4/r;->c:I

    iget v3, p1, Lf4/r;->b:I

    sub-int/2addr v0, v3

    iput v0, p1, Lf4/r;->c:I

    iput v1, p1, Lf4/r;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget v0, p1, Lf4/r;->c:I

    iget v1, p0, Lf4/r;->b:I

    add-int v3, v1, p2

    iget-object v4, p0, Lf4/r;->a:[B

    invoke-static {v0, v1, v3, v4, v2}, La3/j;->S2(III[B[B)V

    iget v0, p1, Lf4/r;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lf4/r;->c:I

    iget p1, p0, Lf4/r;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lf4/r;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
