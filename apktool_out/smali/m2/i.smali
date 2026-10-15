.class public final Lm2/i;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm2/i;->a:I

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lm2/i;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x9

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lt2/b;->T()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lt2/b;->P()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lt2/b;->K()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    :goto_0
    return-object v1

    :pswitch_0
    invoke-virtual {p1}, Lt2/b;->T()I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lt2/b;->P()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lt2/b;->K()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic c(Lt2/c;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm2/i;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lm2/i;->d(Lt2/c;Ljava/lang/Number;)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lm2/i;->d(Lt2/c;Ljava/lang/Number;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lt2/c;Ljava/lang/Number;)V
    .locals 2

    iget v0, p0, Lm2/i;->a:I

    packed-switch v0, :pswitch_data_0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lt2/c;->G()Lt2/c;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lm2/m;->a(D)V

    invoke-virtual {p1, p2}, Lt2/c;->L(Ljava/lang/Number;)V

    :goto_0
    return-void

    :pswitch_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Lt2/c;->G()Lt2/c;

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lm2/m;->a(D)V

    invoke-virtual {p1, p2}, Lt2/c;->L(Ljava/lang/Number;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
