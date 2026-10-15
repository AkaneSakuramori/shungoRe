.class public Lf2/h;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lf2/x;


# static fields
.field public static final x:Landroid/graphics/Paint;


# instance fields
.field public b:Lf2/g;

.field public final c:[Lf2/v;

.field public final d:[Lf2/v;

.field public final e:Ljava/util/BitSet;

.field public f:Z

.field public final g:Landroid/graphics/Matrix;

.field public final h:Landroid/graphics/Path;

.field public final i:Landroid/graphics/Path;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/Region;

.field public final m:Landroid/graphics/Region;

.field public n:Lf2/l;

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/Paint;

.field public final q:Le2/a;

.field public final r:Le/n0;

.field public final s:Lf2/o;

.field public t:Landroid/graphics/PorterDuffColorFilter;

.field public u:Landroid/graphics/PorterDuffColorFilter;

.field public final v:Landroid/graphics/RectF;

.field public final w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lf2/h;->x:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/l;

    invoke-direct {v0}, Lf2/l;-><init>()V

    invoke-direct {p0, v0}, Lf2/h;-><init>(Lf2/l;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, Lf2/l;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lf2/k;

    move-result-object p1

    invoke-virtual {p1}, Lf2/k;->a()Lf2/l;

    move-result-object p1

    invoke-direct {p0, p1}, Lf2/h;-><init>(Lf2/l;)V

    return-void
.end method

.method public constructor <init>(Lf2/g;)V
    .locals 5

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Lf2/v;

    iput-object v1, p0, Lf2/h;->c:[Lf2/v;

    new-array v0, v0, [Lf2/v;

    iput-object v0, p0, Lf2/h;->d:[Lf2/v;

    .line 5
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lf2/h;->e:Ljava/util/BitSet;

    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lf2/h;->g:Landroid/graphics/Matrix;

    .line 7
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lf2/h;->h:Landroid/graphics/Path;

    .line 8
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lf2/h;->i:Landroid/graphics/Path;

    .line 9
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lf2/h;->j:Landroid/graphics/RectF;

    .line 10
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lf2/h;->k:Landroid/graphics/RectF;

    .line 11
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, Lf2/h;->l:Landroid/graphics/Region;

    .line 12
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, Lf2/h;->m:Landroid/graphics/Region;

    .line 13
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lf2/h;->o:Landroid/graphics/Paint;

    .line 14
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, Lf2/h;->p:Landroid/graphics/Paint;

    .line 15
    new-instance v3, Le2/a;

    invoke-direct {v3}, Le2/a;-><init>()V

    iput-object v3, p0, Lf2/h;->q:Le2/a;

    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_0

    .line 17
    sget-object v3, Lf2/m;->a:Lf2/o;

    goto :goto_0

    .line 18
    :cond_0
    new-instance v3, Lf2/o;

    invoke-direct {v3}, Lf2/o;-><init>()V

    :goto_0
    iput-object v3, p0, Lf2/h;->s:Lf2/o;

    .line 19
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Lf2/h;->v:Landroid/graphics/RectF;

    iput-boolean v1, p0, Lf2/h;->w:Z

    iput-object p1, p0, Lf2/h;->b:Lf2/g;

    .line 20
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    invoke-virtual {p0}, Lf2/h;->m()Z

    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lf2/h;->l([I)Z

    .line 24
    new-instance p1, Le/n0;

    const/16 v0, 0x1d

    invoke-direct {p1, v0, p0}, Le/n0;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lf2/h;->r:Le/n0;

    return-void
.end method

.method public constructor <init>(Lf2/l;)V
    .locals 1

    .line 3
    new-instance v0, Lf2/g;

    invoke-direct {v0, p1}, Lf2/g;-><init>(Lf2/l;)V

    invoke-direct {p0, v0}, Lf2/h;-><init>(Lf2/g;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 6

    iget-object v0, p0, Lf2/h;->s:Lf2/o;

    iget-object v1, p0, Lf2/h;->b:Lf2/g;

    iget-object v2, v1, Lf2/g;->a:Lf2/l;

    iget v3, v1, Lf2/g;->j:F

    iget-object v4, p0, Lf2/h;->r:Le/n0;

    move-object v1, v2

    move v2, v3

    move-object v3, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lf2/o;->a(Lf2/l;FLandroid/graphics/RectF;Le/n0;Landroid/graphics/Path;)V

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->i:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf2/h;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, Lf2/h;->b:Lf2/g;

    iget v1, v1, Lf2/g;->i:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    div-float/2addr p1, v3

    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {p2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object p1, p0, Lf2/h;->v:Landroid/graphics/RectF;

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    return-void
.end method

.method public final b(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, Lf2/h;->c(I)I

    move-result p1

    :cond_1
    new-instance p3, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {p3, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_2

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-virtual {p0, p1}, Lf2/h;->c(I)I

    move-result p2

    if-eq p2, p1, :cond_3

    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, p2, p3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_1
    move-object p3, p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    return-object p3
.end method

.method public final c(I)I
    .locals 7

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->n:F

    iget v2, v0, Lf2/g;->o:F

    add-float/2addr v1, v2

    iget v2, v0, Lf2/g;->m:F

    add-float/2addr v1, v2

    iget-object v0, v0, Lf2/g;->b:Ly1/a;

    if-eqz v0, :cond_3

    iget-boolean v2, v0, Ly1/a;->a:Z

    if-eqz v2, :cond_3

    const/16 v2, 0xff

    invoke-static {p1, v2}, Lb0/a;->d(II)I

    move-result v3

    iget v4, v0, Ly1/a;->d:I

    if-ne v3, v4, :cond_3

    iget v3, v0, Ly1/a;->e:F

    const/4 v4, 0x0

    cmpg-float v5, v3, v4

    if-lez v5, :cond_1

    cmpg-float v5, v1, v4

    if-gtz v5, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr v1, v3

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v5

    double-to-float v1, v5

    const/high16 v3, 0x40900000    # 4.5f

    mul-float/2addr v1, v3

    const/high16 v3, 0x40000000    # 2.0f

    add-float/2addr v1, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v4

    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    invoke-static {p1, v2}, Lb0/a;->d(II)I

    move-result p1

    iget v2, v0, Ly1/a;->b:I

    invoke-static {p1, v2, v1}, Lc3/h;->t1(IIF)I

    move-result p1

    cmpl-float v1, v1, v4

    if-lez v1, :cond_2

    iget v0, v0, Ly1/a;->c:I

    if-eqz v0, :cond_2

    sget v1, Ly1/a;->f:I

    invoke-static {v0, v1}, Lb0/a;->d(II)I

    move-result v0

    invoke-static {v0, p1}, Lb0/a;->b(II)I

    move-result p1

    :cond_2
    invoke-static {p1, v3}, Lb0/a;->d(II)I

    move-result p1

    :cond_3
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, Lf2/h;->e:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "h"

    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->r:I

    iget-object v1, p0, Lf2/h;->h:Landroid/graphics/Path;

    iget-object v2, p0, Lf2/h;->q:Le2/a;

    if-eqz v0, :cond_1

    iget-object v0, v2, Le2/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lf2/h;->c:[Lf2/v;

    aget-object v3, v3, v0

    iget-object v4, p0, Lf2/h;->b:Lf2/g;

    iget v4, v4, Lf2/g;->q:I

    sget-object v5, Lf2/v;->b:Landroid/graphics/Matrix;

    invoke-virtual {v3, v5, v2, v4, p1}, Lf2/v;->a(Landroid/graphics/Matrix;Le2/a;ILandroid/graphics/Canvas;)V

    iget-object v3, p0, Lf2/h;->d:[Lf2/v;

    aget-object v3, v3, v0

    iget-object v4, p0, Lf2/h;->b:Lf2/g;

    iget v4, v4, Lf2/g;->q:I

    invoke-virtual {v3, v5, v2, v4, p1}, Lf2/v;->a(Landroid/graphics/Matrix;Le2/a;ILandroid/graphics/Canvas;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lf2/h;->w:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v2, v0, Lf2/g;->r:I

    int-to-double v2, v2

    iget v0, v0, Lf2/g;->s:I

    int-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    double-to-int v0, v4

    iget-object v2, p0, Lf2/h;->b:Lf2/g;

    iget v3, v2, Lf2/g;->r:I

    int-to-double v3, v3

    iget v2, v2, Lf2/g;->s:I

    int-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    mul-double/2addr v5, v3

    double-to-int v2, v5

    neg-int v3, v0

    int-to-float v3, v3

    neg-int v4, v2

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    sget-object v3, Lf2/h;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    int-to-float v0, v0

    int-to-float v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    iget-object v8, v6, Lf2/h;->o:Landroid/graphics/Paint;

    iget-object v0, v6, Lf2/h;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    move-result v9

    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->l:I

    ushr-int/lit8 v1, v0, 0x7

    add-int/2addr v0, v1

    mul-int/2addr v0, v9

    ushr-int/lit8 v0, v0, 0x8

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v10, v6, Lf2/h;->p:Landroid/graphics/Paint;

    iget-object v0, v6, Lf2/h;->u:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->k:F

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v10}, Landroid/graphics/Paint;->getAlpha()I

    move-result v11

    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->l:I

    ushr-int/lit8 v1, v0, 0x7

    add-int/2addr v0, v1

    mul-int/2addr v0, v11

    ushr-int/lit8 v0, v0, 0x8

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-boolean v0, v6, Lf2/h;->f:Z

    iget-object v3, v6, Lf2/h;->h:Landroid/graphics/Path;

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lf2/h;->h()Z

    move-result v0

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    div-float/2addr v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    neg-float v0, v0

    iget-object v4, v6, Lf2/h;->b:Lf2/g;

    iget-object v4, v4, Lf2/g;->a:Lf2/l;

    new-instance v5, Lf2/f;

    invoke-direct {v5, v0}, Lf2/f;-><init>(F)V

    invoke-virtual {v4}, Lf2/l;->e()Lf2/k;

    move-result-object v0

    iget-object v12, v4, Lf2/l;->e:Lf2/c;

    invoke-virtual {v5, v12}, Lf2/f;->a(Lf2/c;)Lf2/c;

    move-result-object v12

    iput-object v12, v0, Lf2/k;->e:Lf2/c;

    iget-object v12, v4, Lf2/l;->f:Lf2/c;

    invoke-virtual {v5, v12}, Lf2/f;->a(Lf2/c;)Lf2/c;

    move-result-object v12

    iput-object v12, v0, Lf2/k;->f:Lf2/c;

    iget-object v12, v4, Lf2/l;->h:Lf2/c;

    invoke-virtual {v5, v12}, Lf2/f;->a(Lf2/c;)Lf2/c;

    move-result-object v12

    iput-object v12, v0, Lf2/k;->h:Lf2/c;

    iget-object v4, v4, Lf2/l;->g:Lf2/c;

    invoke-virtual {v5, v4}, Lf2/f;->a(Lf2/c;)Lf2/c;

    move-result-object v4

    iput-object v4, v0, Lf2/k;->g:Lf2/c;

    invoke-virtual {v0}, Lf2/k;->a()Lf2/l;

    move-result-object v13

    iput-object v13, v6, Lf2/h;->n:Lf2/l;

    iget-object v12, v6, Lf2/h;->s:Lf2/o;

    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v14, v0, Lf2/g;->j:F

    iget-object v15, v6, Lf2/h;->k:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual/range {p0 .. p0}, Lf2/h;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    div-float v1, v0, v2

    :cond_1
    invoke-virtual {v15, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, v6, Lf2/h;->i:Landroid/graphics/Path;

    const/16 v16, 0x0

    move-object/from16 v17, v0

    invoke-virtual/range {v12 .. v17}, Lf2/o;->a(Lf2/l;FLandroid/graphics/RectF;Le/n0;Landroid/graphics/Path;)V

    invoke-virtual/range {p0 .. p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v6, v0, v3}, Lf2/h;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    const/4 v0, 0x0

    iput-boolean v0, v6, Lf2/h;->f:Z

    :cond_2
    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->p:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    iget v2, v0, Lf2/g;->q:I

    if-lez v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v0, v0, Lf2/g;->a:Lf2/l;

    invoke-virtual/range {p0 .. p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v0, v4}, Lf2/l;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0x1d

    if-ge v1, v0, :cond_6

    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->r:I

    int-to-double v4, v1

    iget v0, v0, Lf2/g;->s:I

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    mul-double/2addr v0, v4

    double-to-int v0, v0

    iget-object v1, v6, Lf2/h;->b:Lf2/g;

    iget v4, v1, Lf2/g;->r:I

    int-to-double v4, v4

    iget v1, v1, Lf2/g;->s:I

    int-to-double v12, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double/2addr v12, v4

    double-to-int v1, v12

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-boolean v0, v6, Lf2/h;->w:Z

    if-nez v0, :cond_4

    invoke-virtual/range {p0 .. p1}, Lf2/h;->d(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_1

    :cond_4
    iget-object v0, v6, Lf2/h;->v:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v1, v4

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    float-to-int v4, v4

    if-ltz v1, :cond_5

    if-ltz v4, :cond_5

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v5

    float-to-int v5, v5

    iget-object v12, v6, Lf2/h;->b:Lf2/g;

    iget v12, v12, Lf2/g;->q:I

    mul-int/2addr v12, v2

    add-int/2addr v12, v5

    add-int/2addr v12, v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    float-to-int v0, v0

    iget-object v5, v6, Lf2/h;->b:Lf2/g;

    iget v5, v5, Lf2/g;->q:I

    mul-int/2addr v5, v2

    add-int/2addr v5, v0

    add-int/2addr v5, v4

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v12, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    iget-object v12, v6, Lf2/h;->b:Lf2/g;

    iget v12, v12, Lf2/g;->q:I

    sub-int/2addr v5, v12

    sub-int/2addr v5, v1

    int-to-float v1, v5

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    iget-object v12, v6, Lf2/h;->b:Lf2/g;

    iget v12, v12, Lf2/g;->q:I

    sub-int/2addr v5, v12

    sub-int/2addr v5, v4

    int-to-float v4, v5

    neg-float v5, v1

    neg-float v12, v4

    invoke-virtual {v2, v5, v12}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v6, v2}, Lf2/h;->d(Landroid/graphics/Canvas;)V

    const/4 v2, 0x0

    invoke-virtual {v7, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid shadow bounds. Check that the treatments result in a valid path."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_1
    iget-object v0, v6, Lf2/h;->b:Lf2/g;

    iget-object v1, v0, Lf2/g;->u:Landroid/graphics/Paint$Style;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v1, v2, :cond_7

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    if-ne v1, v2, :cond_8

    :cond_7
    iget-object v4, v0, Lf2/g;->a:Lf2/l;

    invoke-virtual/range {p0 .. p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v8

    invoke-virtual/range {v0 .. v5}, Lf2/h;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lf2/l;Landroid/graphics/RectF;)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lf2/h;->h()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual/range {p0 .. p1}, Lf2/h;->f(Landroid/graphics/Canvas;)V

    :cond_9
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lf2/l;Landroid/graphics/RectF;)V
    .locals 1

    invoke-virtual {p4, p5}, Lf2/l;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p4, Lf2/l;->f:Lf2/c;

    invoke-interface {p3, p5}, Lf2/c;->a(Landroid/graphics/RectF;)F

    move-result p3

    iget-object p4, p0, Lf2/h;->b:Lf2/g;

    iget p4, p4, Lf2/g;->j:F

    mul-float/2addr p3, p4

    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v2, p0, Lf2/h;->p:Landroid/graphics/Paint;

    iget-object v3, p0, Lf2/h;->i:Landroid/graphics/Path;

    iget-object v4, p0, Lf2/h;->n:Lf2/l;

    iget-object v5, p0, Lf2/h;->k:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, Lf2/h;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lf2/h;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lf2/l;Landroid/graphics/RectF;)V

    return-void
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, Lf2/h;->j:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    return-object v0
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v0, v0, Lf2/g;->l:I

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->p:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lf2/g;->a:Lf2/l;

    invoke-virtual {p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/l;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->a:Lf2/l;

    iget-object v0, v0, Lf2/l;->e:Lf2/c;

    invoke-virtual {p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, Lf2/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    iget-object v1, p0, Lf2/h;->b:Lf2/g;

    iget v1, v1, Lf2/g;->j:F

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lf2/h;->h:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v1}, Lf2/h;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_2

    invoke-static {p1, v1}, Lj0/f;->b(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    goto :goto_0

    :cond_2
    const/16 v2, 0x1d

    if-lt v0, v2, :cond_3

    :try_start_0
    invoke-virtual {p1, v1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    :catch_0
    :cond_4
    :goto_0
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lf2/h;->l:Landroid/graphics/Region;

    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    invoke-virtual {p0}, Lf2/h;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v2, p0, Lf2/h;->h:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v2}, Lf2/h;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, Lf2/h;->m:Landroid/graphics/Region;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v1
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->u:Landroid/graphics/Paint$Style;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lf2/h;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    new-instance v1, Ly1/a;

    invoke-direct {v1, p1}, Ly1/a;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lf2/g;->b:Ly1/a;

    invoke-virtual {p0}, Lf2/h;->n()V

    return-void
.end method

.method public final invalidateSelf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/h;->f:Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public isStateful()Z
    .locals 1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->f:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->e:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->d:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j(F)V
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->n:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, Lf2/g;->n:F

    invoke-virtual {p0}, Lf2/h;->n()V

    :cond_0
    return-void
.end method

.method public final k(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v1, v0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lf2/h;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final l([I)Z
    .locals 5

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v0, v0, Lf2/g;->c:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf2/h;->o:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    iget-object v3, p0, Lf2/h;->b:Lf2/g;

    iget-object v3, v3, Lf2/g;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lf2/h;->b:Lf2/g;

    iget-object v2, v2, Lf2/g;->d:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lf2/h;->p:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    move-result v3

    iget-object v4, p0, Lf2/h;->b:Lf2/g;

    iget-object v4, v4, Lf2/g;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eq v3, p1, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    return v1
.end method

.method public final m()Z
    .locals 7

    iget-object v0, p0, Lf2/h;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, Lf2/h;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, Lf2/h;->b:Lf2/g;

    iget-object v3, v2, Lf2/g;->f:Landroid/content/res/ColorStateList;

    iget-object v2, v2, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    iget-object v4, p0, Lf2/h;->o:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {p0, v3, v2, v4, v5}, Lf2/h;->b(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    iput-object v2, p0, Lf2/h;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, Lf2/h;->b:Lf2/g;

    iget-object v3, v2, Lf2/g;->e:Landroid/content/res/ColorStateList;

    iget-object v2, v2, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    iget-object v4, p0, Lf2/h;->p:Landroid/graphics/Paint;

    const/4 v6, 0x0

    invoke-virtual {p0, v3, v2, v4, v6}, Lf2/h;->b(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    iput-object v2, p0, Lf2/h;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, Lf2/h;->b:Lf2/g;

    iget-boolean v3, v2, Lf2/g;->t:Z

    if-eqz v3, :cond_0

    iget-object v2, v2, Lf2/g;->f:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    invoke-virtual {v2, v3, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    iget-object v3, p0, Lf2/h;->q:Le2/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x44

    invoke-static {v2, v4}, Lb0/a;->d(II)I

    move-result v4

    iput v4, v3, Le2/a;->d:I

    const/16 v4, 0x14

    invoke-static {v2, v4}, Lb0/a;->d(II)I

    move-result v4

    iput v4, v3, Le2/a;->e:I

    invoke-static {v2, v6}, Lb0/a;->d(II)I

    move-result v2

    iput v2, v3, Le2/a;->f:I

    iget-object v2, v3, Le2/a;->a:Landroid/graphics/Paint;

    iget v3, v3, Le2/a;->d:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    iget-object v2, p0, Lf2/h;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v0, v2}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf2/h;->u:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v1, v0}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v5, v6

    :cond_2
    :goto_0
    return v5
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lf2/g;

    iget-object v1, p0, Lf2/h;->b:Lf2/g;

    invoke-direct {v0, v1}, Lf2/g;-><init>(Lf2/g;)V

    iput-object v0, p0, Lf2/h;->b:Lf2/g;

    return-object p0
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->n:F

    iget v2, v0, Lf2/g;->o:F

    add-float/2addr v1, v2

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v2, v1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v0, Lf2/g;->q:I

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, v0, Lf2/g;->r:I

    invoke-virtual {p0}, Lf2/h;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/h;->f:Z

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    invoke-virtual {p0, p1}, Lf2/h;->l([I)Z

    move-result p1

    invoke-virtual {p0}, Lf2/h;->m()Z

    move-result v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lf2/h;->invalidateSelf()V

    :cond_2
    return p1
.end method

.method public setAlpha(I)V
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget v1, v0, Lf2/g;->l:I

    if-eq v1, p1, :cond_0

    iput p1, v0, Lf2/g;->l:I

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iget-object p1, p0, Lf2/h;->b:Lf2/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setShapeAppearanceModel(Lf2/l;)V
    .locals 1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iput-object p1, v0, Lf2/g;->a:Lf2/l;

    invoke-virtual {p0}, Lf2/h;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf2/h;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iput-object p1, v0, Lf2/g;->f:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lf2/h;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Lf2/h;->b:Lf2/g;

    iget-object v1, v0, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lf2/g;->g:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lf2/h;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
