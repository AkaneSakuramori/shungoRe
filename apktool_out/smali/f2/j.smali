.class public final Lf2/j;
.super Lc3/h;
.source "SourceFile"


# virtual methods
.method public final S0(FFLf2/w;)V
    .locals 6

    mul-float v0, p2, p1

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p3, v0, v1, v2}, Lf2/w;->d(FFF)V

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p2, v0

    mul-float/2addr p2, p1

    new-instance p1, Lf2/s;

    const/4 v3, 0x0

    invoke-direct {p1, v3, v3, p2, p2}, Lf2/s;-><init>(FFFF)V

    iput v1, p1, Lf2/s;->f:F

    iput v2, p1, Lf2/s;->g:F

    iget-object v2, p3, Lf2/w;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lf2/q;

    invoke-direct {v2, p1}, Lf2/q;-><init>(Lf2/s;)V

    invoke-virtual {p3, v1}, Lf2/w;->a(F)V

    iget-object p1, p3, Lf2/w;->h:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p3, Lf2/w;->e:F

    add-float v1, v3, p2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    sub-float/2addr p2, v3

    div-float/2addr p2, v0

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float p1, v4

    mul-float/2addr p1, p2

    add-float/2addr p1, v1

    iput p1, p3, Lf2/w;->c:F

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float p1, v2

    mul-float/2addr p2, p1

    add-float/2addr p2, v1

    iput p2, p3, Lf2/w;->d:F

    return-void
.end method
