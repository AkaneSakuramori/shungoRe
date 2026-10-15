.class public final Lf4/f;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lf4/i;


# direct methods
.method public synthetic constructor <init>(Lf4/i;I)V
    .locals 0

    iput p2, p0, Lf4/f;->b:I

    iput-object p1, p0, Lf4/f;->c:Lf4/i;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    iget v0, p0, Lf4/f;->b:I

    const v1, 0x7fffffff

    iget-object v2, p0, Lf4/f;->c:Lf4/i;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lf4/q;

    iget-boolean v0, v2, Lf4/q;->d:Z

    if-nez v0, :cond_0

    iget-object v0, v2, Lf4/q;->c:Lf4/g;

    iget-wide v2, v0, Lf4/g;->c:J

    int-to-long v0, v1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast v2, Lf4/g;

    iget-wide v2, v2, Lf4/g;->c:J

    int-to-long v0, v1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget v0, p0, Lf4/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf4/f;->c:Lf4/i;

    check-cast v0, Lf4/q;

    invoke-virtual {v0}, Lf4/q;->close()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read()I
    .locals 7

    iget v0, p0, Lf4/f;->b:I

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    iget-object v4, p0, Lf4/f;->c:Lf4/i;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lf4/q;

    .line 10
    iget-boolean v0, v4, Lf4/q;->d:Z

    if-nez v0, :cond_1

    .line 11
    iget-object v0, v4, Lf4/q;->c:Lf4/g;

    iget-wide v5, v0, Lf4/g;->c:J

    cmp-long v2, v5, v2

    if-nez v2, :cond_0

    .line 12
    iget-object v2, v4, Lf4/q;->b:Lf4/w;

    const-wide/16 v3, 0x2000

    invoke-interface {v2, v0, v3, v4}, Lf4/w;->f(Lf4/g;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lf4/g;->B()B

    move-result v0

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1

    .line 14
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast v4, Lf4/g;

    .line 15
    iget-wide v5, v4, Lf4/g;->c:J

    cmp-long v0, v5, v2

    if-lez v0, :cond_2

    .line 16
    invoke-virtual {v4}, Lf4/g;->B()B

    move-result v0

    and-int/lit16 v1, v0, 0xff

    :cond_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 8

    iget v0, p0, Lf4/f;->b:I

    iget-object v1, p0, Lf4/f;->c:Lf4/i;

    packed-switch v0, :pswitch_data_0

    const-string v0, "data"

    .line 1
    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf4/q;

    .line 2
    iget-boolean v0, v1, Lf4/q;->d:Z

    if-nez v0, :cond_1

    .line 3
    array-length v0, p1

    int-to-long v2, v0

    int-to-long v4, p2

    int-to-long v6, p3

    invoke-static/range {v2 .. v7}, Lc3/h;->c0(JJJ)V

    .line 4
    iget-object v0, v1, Lf4/q;->c:Lf4/g;

    iget-wide v2, v0, Lf4/g;->c:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 5
    iget-object v1, v1, Lf4/q;->b:Lf4/w;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lf4/w;->f(Lf4/g;J)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lf4/g;->x([BII)I

    move-result p1

    :goto_0
    return p1

    .line 7
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const-string v0, "sink"

    .line 8
    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf4/g;

    .line 9
    invoke-virtual {v1, p1, p2, p3}, Lf4/g;->x([BII)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lf4/f;->b:I

    const-string v1, ".inputStream()"

    iget-object v2, p0, Lf4/f;->c:Lf4/i;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v2, Lf4/q;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v2, Lf4/g;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
