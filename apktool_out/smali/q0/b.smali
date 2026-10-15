.class public abstract Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf2/e;->c:Lf2/e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lf2/e;

    invoke-direct {v0}, Lf2/e;-><init>()V

    sput-object v0, Lf2/e;->c:Lf2/e;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    invoke-static {v0, v0, v0, v1}, Lk0/a;->b(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v0

    const v1, 0x7f030335

    .line 6
    invoke-static {p1, v1, v0}, Lc3/h;->l2(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v0

    iput-object v0, p0, Lq0/b;->d:Ljava/lang/Object;

    const v0, 0x7f030324

    const/16 v1, 0x12c

    .line 7
    invoke-static {p1, v0, v1}, Lc3/h;->k2(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lq0/b;->a:I

    const v0, 0x7f030329

    const/16 v1, 0x96

    .line 8
    invoke-static {p1, v0, v1}, Lc3/h;->k2(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lq0/b;->b:I

    const v0, 0x7f030328

    const/16 v1, 0x64

    .line 9
    invoke-static {p1, v0, v1}, Lc3/h;->k2(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lq0/b;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget v0, p0, Lq0/b;->c:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, Lq0/b;->b:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(ILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p2, p0, Lq0/b;->d:Ljava/lang/Object;

    if-eqz p2, :cond_0

    iput p1, p0, Lq0/b;->a:I

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Lq0/b;->b:I

    iget-object p2, p0, Lq0/b;->d:Ljava/lang/Object;

    check-cast p2, Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    iput p1, p0, Lq0/b;->c:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lq0/b;->a:I

    iput p1, p0, Lq0/b;->b:I

    iput p1, p0, Lq0/b;->c:I

    :goto_0
    return-void
.end method
