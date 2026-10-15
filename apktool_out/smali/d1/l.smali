.class public final Ld1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Ld1/i;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Ln/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Ld1/l;->p:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ld1/l;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Ld1/l;->h:F

    iput v0, p0, Ld1/l;->i:F

    iput v0, p0, Ld1/l;->j:F

    iput v0, p0, Ld1/l;->k:F

    const/16 v0, 0xff

    iput v0, p0, Ld1/l;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/l;->m:Ljava/lang/String;

    iput-object v0, p0, Ld1/l;->n:Ljava/lang/Boolean;

    .line 3
    new-instance v0, Ln/b;

    .line 4
    invoke-direct {v0}, Ln/k;-><init>()V

    iput-object v0, p0, Ld1/l;->o:Ln/b;

    .line 5
    new-instance v0, Ld1/i;

    invoke-direct {v0}, Ld1/i;-><init>()V

    iput-object v0, p0, Ld1/l;->g:Ld1/i;

    .line 6
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ld1/l;->a:Landroid/graphics/Path;

    .line 7
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ld1/l;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Ld1/l;)V
    .locals 3

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ld1/l;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Ld1/l;->h:F

    iput v0, p0, Ld1/l;->i:F

    iput v0, p0, Ld1/l;->j:F

    iput v0, p0, Ld1/l;->k:F

    const/16 v0, 0xff

    iput v0, p0, Ld1/l;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/l;->m:Ljava/lang/String;

    iput-object v0, p0, Ld1/l;->n:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Ln/b;

    .line 11
    invoke-direct {v0}, Ln/k;-><init>()V

    iput-object v0, p0, Ld1/l;->o:Ln/b;

    .line 12
    new-instance v1, Ld1/i;

    iget-object v2, p1, Ld1/l;->g:Ld1/i;

    invoke-direct {v1, v2, v0}, Ld1/i;-><init>(Ld1/i;Ln/b;)V

    iput-object v1, p0, Ld1/l;->g:Ld1/i;

    .line 13
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ld1/l;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ld1/l;->a:Landroid/graphics/Path;

    .line 14
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ld1/l;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ld1/l;->b:Landroid/graphics/Path;

    .line 15
    iget v1, p1, Ld1/l;->h:F

    iput v1, p0, Ld1/l;->h:F

    .line 16
    iget v1, p1, Ld1/l;->i:F

    iput v1, p0, Ld1/l;->i:F

    .line 17
    iget v1, p1, Ld1/l;->j:F

    iput v1, p0, Ld1/l;->j:F

    .line 18
    iget v1, p1, Ld1/l;->k:F

    iput v1, p0, Ld1/l;->k:F

    .line 19
    iget v1, p1, Ld1/l;->l:I

    iput v1, p0, Ld1/l;->l:I

    .line 20
    iget-object v1, p1, Ld1/l;->m:Ljava/lang/String;

    iput-object v1, p0, Ld1/l;->m:Ljava/lang/String;

    .line 21
    iget-object v1, p1, Ld1/l;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 22
    invoke-virtual {v0, v1, p0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_0
    iget-object p1, p1, Ld1/l;->n:Ljava/lang/Boolean;

    iput-object p1, p0, Ld1/l;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Ld1/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    iget-object v0, v7, Ld1/i;->a:Landroid/graphics/Matrix;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v9, v7, Ld1/i;->a:Landroid/graphics/Matrix;

    iget-object v0, v7, Ld1/i;->j:Landroid/graphics/Matrix;

    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    iget-object v0, v7, Ld1/i;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v11, v1, :cond_17

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/j;

    instance-of v1, v0, Ld1/i;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ld1/i;

    move-object/from16 v0, p0

    move-object v2, v9

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Ld1/l;->a(Ld1/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    :cond_0
    move/from16 v1, p4

    move/from16 v3, p5

    move/from16 v17, v11

    goto/16 :goto_a

    :cond_1
    instance-of v1, v0, Ld1/k;

    if-eqz v1, :cond_0

    check-cast v0, Ld1/k;

    move/from16 v1, p4

    int-to-float v2, v1

    iget v3, v6, Ld1/l;->j:F

    div-float/2addr v2, v3

    move/from16 v3, p5

    int-to-float v4, v3

    iget v5, v6, Ld1/l;->k:F

    div-float/2addr v4, v5

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iget-object v12, v6, Ld1/l;->c:Landroid/graphics/Matrix;

    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    invoke-virtual {v12, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v2, 0x4

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->mapVectors([F)V

    aget v4, v2, v10

    float-to-double v13, v4

    const/4 v4, 0x1

    aget v15, v2, v4

    move/from16 p2, v5

    float-to-double v4, v15

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v5, 0x2

    aget v13, v2, v5

    float-to-double v13, v13

    const/4 v15, 0x3

    aget v5, v2, v15

    move/from16 v17, v11

    float-to-double v10, v5

    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v10

    double-to-float v5, v10

    const/4 v10, 0x0

    aget v11, v2, v10

    const/4 v10, 0x1

    aget v13, v2, v10

    const/4 v10, 0x2

    aget v10, v2, v10

    aget v2, v2, v15

    mul-float/2addr v11, v2

    mul-float/2addr v13, v10

    sub-float/2addr v11, v13

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v5, v2, v4

    if-lez v5, :cond_2

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v2

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    cmpl-float v2, v5, v4

    if-nez v2, :cond_3

    goto/16 :goto_a

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v6, Ld1/l;->a:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, Ld1/k;->a:[Lb0/f;

    if-eqz v10, :cond_4

    invoke-static {v10, v2}, Lb0/f;->b([Lb0/f;Landroid/graphics/Path;)V

    :cond_4
    iget-object v10, v6, Ld1/l;->b:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    instance-of v11, v0, Ld1/g;

    if-eqz v11, :cond_6

    iget v0, v0, Ld1/k;->c:I

    if-nez v0, :cond_5

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_2

    :cond_5
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_2
    invoke-virtual {v10, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    invoke-virtual {v8, v10}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto/16 :goto_a

    :cond_6
    check-cast v0, Ld1/h;

    iget v11, v0, Ld1/h;->j:F

    cmpl-float v13, v11, v4

    const/high16 v14, 0x3f800000    # 1.0f

    if-nez v13, :cond_7

    iget v13, v0, Ld1/h;->k:F

    cmpl-float v13, v13, v14

    if-eqz v13, :cond_a

    :cond_7
    iget v13, v0, Ld1/h;->l:F

    add-float/2addr v11, v13

    rem-float/2addr v11, v14

    iget v15, v0, Ld1/h;->k:F

    add-float/2addr v15, v13

    rem-float/2addr v15, v14

    iget-object v13, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    if-nez v13, :cond_8

    new-instance v13, Landroid/graphics/PathMeasure;

    invoke-direct {v13}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v13, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    :cond_8
    iget-object v13, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    const/4 v14, 0x0

    invoke-virtual {v13, v2, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v13, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v13}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v13

    mul-float/2addr v11, v13

    mul-float/2addr v15, v13

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    cmpl-float v16, v11, v15

    if-lez v16, :cond_9

    iget-object v14, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    const/4 v4, 0x1

    invoke-virtual {v14, v11, v13, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v11, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    const/4 v13, 0x0

    invoke-virtual {v11, v13, v15, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto :goto_3

    :cond_9
    move v13, v4

    const/4 v4, 0x1

    iget-object v14, v6, Ld1/l;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v14, v11, v15, v2, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    :goto_3
    invoke-virtual {v2, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    :cond_a
    invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    iget-object v2, v0, Ld1/h;->g:La0/d;

    iget-object v4, v2, La0/d;->a:Landroid/graphics/Shader;

    if-eqz v4, :cond_b

    goto :goto_4

    :cond_b
    iget v4, v2, La0/d;->c:I

    if-eqz v4, :cond_c

    :goto_4
    const/4 v4, 0x1

    goto :goto_5

    :cond_c
    const/4 v4, 0x0

    :goto_5
    const/4 v13, 0x0

    const/16 v14, 0xff

    const/high16 v15, 0x437f0000    # 255.0f

    if-eqz v4, :cond_10

    iget-object v4, v6, Ld1/l;->e:Landroid/graphics/Paint;

    if-nez v4, :cond_d

    new-instance v4, Landroid/graphics/Paint;

    const/4 v11, 0x1

    invoke-direct {v4, v11}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v4, v6, Ld1/l;->e:Landroid/graphics/Paint;

    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_d
    iget-object v4, v6, Ld1/l;->e:Landroid/graphics/Paint;

    iget-object v11, v2, La0/d;->a:Landroid/graphics/Shader;

    if-eqz v11, :cond_e

    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget v2, v0, Ld1/h;->i:F

    mul-float/2addr v2, v15

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_6

    :cond_e
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v2, v2, La0/d;->c:I

    iget v11, v0, Ld1/h;->i:F

    sget-object v18, Ld1/o;->k:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v14

    const v16, 0xffffff

    and-int v2, v2, v16

    int-to-float v14, v14

    mul-float/2addr v14, v11

    float-to-int v11, v14

    shl-int/lit8 v11, v11, 0x18

    or-int/2addr v2, v11

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_6
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget v2, v0, Ld1/k;->c:I

    if-nez v2, :cond_f

    sget-object v2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_7

    :cond_f
    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_7
    invoke-virtual {v10, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {v8, v10, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_10
    iget-object v2, v0, Ld1/h;->e:La0/d;

    iget-object v4, v2, La0/d;->a:Landroid/graphics/Shader;

    if-eqz v4, :cond_11

    goto :goto_8

    :cond_11
    iget v4, v2, La0/d;->c:I

    if-eqz v4, :cond_16

    :goto_8
    iget-object v4, v6, Ld1/l;->d:Landroid/graphics/Paint;

    if-nez v4, :cond_12

    new-instance v4, Landroid/graphics/Paint;

    const/4 v11, 0x1

    invoke-direct {v4, v11}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v4, v6, Ld1/l;->d:Landroid/graphics/Paint;

    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_12
    iget-object v4, v6, Ld1/l;->d:Landroid/graphics/Paint;

    iget-object v11, v0, Ld1/h;->n:Landroid/graphics/Paint$Join;

    if-eqz v11, :cond_13

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_13
    iget-object v11, v0, Ld1/h;->m:Landroid/graphics/Paint$Cap;

    if-eqz v11, :cond_14

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_14
    iget v11, v0, Ld1/h;->o:F

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget-object v11, v2, La0/d;->a:Landroid/graphics/Shader;

    if-eqz v11, :cond_15

    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget v2, v0, Ld1/h;->h:F

    mul-float/2addr v2, v15

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9

    :cond_15
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/16 v11, 0xff

    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v2, v2, La0/d;->c:I

    iget v11, v0, Ld1/h;->h:F

    sget-object v12, Ld1/o;->k:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v12

    const v14, 0xffffff

    and-int/2addr v2, v14

    int-to-float v12, v12

    mul-float/2addr v12, v11

    float-to-int v11, v12

    shl-int/lit8 v11, v11, 0x18

    or-int/2addr v2, v11

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_9
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float v5, v5, p2

    iget v0, v0, Ld1/h;->f:F

    mul-float/2addr v0, v5

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v8, v10, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_16
    :goto_a
    add-int/lit8 v11, v17, 0x1

    const/4 v10, 0x0

    goto/16 :goto_0

    :cond_17
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, Ld1/l;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, Ld1/l;->l:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Ld1/l;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, Ld1/l;->l:I

    return-void
.end method
