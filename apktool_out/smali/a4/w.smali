.class public final La4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final f:Lf2/e;

.field public static final g:Ljava/util/logging/Logger;


# instance fields
.field public final b:Lf4/i;

.field public final c:Z

.field public final d:La4/v;

.field public final e:La4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/e;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/e;-><init>(II)V

    sput-object v0, La4/w;->f:Lf2/e;

    const-class v0, La4/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(Http2::class.java.name)"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, La4/w;->g:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lf4/i;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/w;->b:Lf4/i;

    iput-boolean p2, p0, La4/w;->c:Z

    new-instance p2, La4/v;

    invoke-direct {p2, p1}, La4/v;-><init>(Lf4/i;)V

    iput-object p2, p0, La4/w;->d:La4/v;

    new-instance p1, La4/d;

    invoke-direct {p1, p2}, La4/d;-><init>(La4/v;)V

    iput-object p1, p0, La4/w;->e:La4/d;

    return-void
.end method


# virtual methods
.method public final a(ZLa4/n;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "handler"

    invoke-static {v0, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v1, La4/w;->b:Lf4/i;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lf4/i;->k(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v1, La4/w;->b:Lf4/i;

    invoke-static {v3}, Lu3/b;->s(Lf4/i;)I

    move-result v3

    const/16 v4, 0x4000

    if-gt v3, v4, :cond_2e

    iget-object v5, v1, La4/w;->b:Lf4/i;

    invoke-interface {v5}, Lf4/i;->B()B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    iget-object v6, v1, La4/w;->b:Lf4/i;

    invoke-interface {v6}, Lf4/i;->B()B

    move-result v6

    and-int/lit16 v7, v6, 0xff

    iget-object v8, v1, La4/w;->b:Lf4/i;

    invoke-interface {v8}, Lf4/i;->E()I

    move-result v8

    const v9, 0x7fffffff

    and-int v13, v8, v9

    sget-object v9, La4/w;->g:Ljava/util/logging/Logger;

    sget-object v10, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v10

    const/4 v15, 0x1

    if-eqz v10, :cond_0

    invoke-static {v13, v3, v5, v7, v15}, La4/g;->a(IIIIZ)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v9, 0x4

    if-eqz p1, :cond_3

    if-ne v5, v9, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a SETTINGS frame but was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, La4/g;->b:[Ljava/lang/String;

    array-length v4, v3

    if-ge v5, v4, :cond_2

    aget-object v3, v3, v5

    goto :goto_0

    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "0x%02x"

    invoke-static {v4, v3}, Lu3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 v14, 0x2

    const/16 v10, 0x8

    const-wide/16 v11, 0x0

    packed-switch v5, :pswitch_data_0

    iget-object v0, v1, La4/w;->b:Lf4/i;

    int-to-long v2, v3

    invoke-interface {v0, v2, v3}, Lf4/i;->q(J)V

    :cond_4
    :goto_2
    move v2, v15

    goto/16 :goto_c

    :pswitch_0
    if-ne v3, v9, :cond_8

    iget-object v2, v1, La4/w;->b:Lf4/i;

    invoke-interface {v2}, Lf4/i;->E()I

    move-result v2

    int-to-long v2, v2

    const-wide/32 v4, 0x7fffffff

    and-long/2addr v2, v4

    cmp-long v4, v2, v11

    if-eqz v4, :cond_7

    if-nez v13, :cond_5

    iget-object v4, v0, La4/n;->c:La4/t;

    monitor-enter v4

    :try_start_1
    iget-wide v5, v4, La4/t;->x:J

    add-long/2addr v5, v2

    iput-wide v5, v4, La4/t;->x:J

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_5
    iget-object v0, v0, La4/n;->c:La4/t;

    invoke-virtual {v0, v13}, La4/t;->h(I)La4/b0;

    move-result-object v5

    if-eqz v5, :cond_4

    monitor-enter v5

    :try_start_2
    iget-wide v6, v5, La4/b0;->f:J

    add-long/2addr v6, v2

    iput-wide v6, v5, La4/b0;->f:J

    if-lez v4, :cond_6

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "windowSizeIncrement was 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    if-lt v3, v10, :cond_f

    if-nez v13, :cond_e

    iget-object v4, v1, La4/w;->b:Lf4/i;

    invoke-interface {v4}, Lf4/i;->E()I

    move-result v4

    iget-object v5, v1, La4/w;->b:Lf4/i;

    invoke-interface {v5}, Lf4/i;->E()I

    move-result v5

    sub-int/2addr v3, v10

    invoke-static {}, La4/b;->values()[La4/b;

    move-result-object v6

    array-length v7, v6

    move v8, v2

    :goto_3
    if-ge v8, v7, :cond_a

    aget-object v9, v6, v8

    iget v10, v9, La4/b;->b:I

    if-ne v10, v5, :cond_9

    move-object v10, v9

    goto :goto_4

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_a
    const/4 v10, 0x0

    :goto_4
    if-eqz v10, :cond_d

    sget-object v5, Lf4/j;->e:Lf4/j;

    if-lez v3, :cond_b

    iget-object v5, v1, La4/w;->b:Lf4/i;

    int-to-long v6, v3

    invoke-interface {v5, v6, v7}, Lf4/i;->l(J)Lf4/j;

    move-result-object v5

    :cond_b
    const-string v3, "debugData"

    invoke-static {v5, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lf4/j;->c()I

    iget-object v3, v0, La4/n;->c:La4/t;

    monitor-enter v3

    :try_start_3
    iget-object v5, v3, La4/t;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v6, v2, [La4/b0;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    iput-boolean v15, v3, La4/t;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v3

    check-cast v5, [La4/b0;

    array-length v3, v5

    :goto_5
    if-ge v2, v3, :cond_4

    aget-object v6, v5, v2

    iget v7, v6, La4/b0;->a:I

    if-le v7, v4, :cond_c

    invoke-virtual {v6}, La4/b0;->g()Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, La4/b;->g:La4/b;

    invoke-virtual {v6, v7}, La4/b0;->j(La4/b;)V

    iget-object v7, v0, La4/n;->c:La4/t;

    iget v6, v6, La4/b0;->a:I

    invoke-virtual {v7, v6}, La4/t;->t(I)La4/b0;

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY unexpected error code: "

    invoke-static {v2, v5}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY length < 8: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-ne v3, v10, :cond_15

    if-nez v13, :cond_14

    iget-object v2, v1, La4/w;->b:Lf4/i;

    invoke-interface {v2}, Lf4/i;->E()I

    move-result v2

    iget-object v3, v1, La4/w;->b:Lf4/i;

    invoke-interface {v3}, Lf4/i;->E()I

    move-result v3

    and-int/lit8 v4, v6, 0x1

    if-eqz v4, :cond_13

    iget-object v3, v0, La4/n;->c:La4/t;

    monitor-enter v3

    const-wide/16 v4, 0x1

    if-eq v2, v15, :cond_12

    if-eq v2, v14, :cond_11

    const/4 v0, 0x3

    if-eq v2, v0, :cond_10

    goto :goto_6

    :cond_10
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_7

    :cond_11
    iget-wide v6, v3, La4/t;->q:J

    add-long/2addr v6, v4

    iput-wide v6, v3, La4/t;->q:J

    goto :goto_6

    :cond_12
    iget-wide v6, v3, La4/t;->o:J

    add-long/2addr v6, v4

    iput-wide v6, v3, La4/t;->o:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_6
    monitor-exit v3

    goto/16 :goto_2

    :goto_7
    monitor-exit v3

    throw v0

    :cond_13
    iget-object v4, v0, La4/n;->c:La4/t;

    iget-object v4, v4, La4/t;->j:Lw3/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, La4/n;->c:La4/t;

    iget-object v6, v6, La4/t;->e:Ljava/lang/String;

    const-string v7, " ping"

    invoke-static {v5, v6, v7}, La;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, v0, La4/n;->c:La4/t;

    new-instance v6, La4/l;

    invoke-direct {v6, v5, v0, v2, v3}, La4/l;-><init>(Ljava/lang/String;La4/t;II)V

    invoke-virtual {v4, v6, v11, v12}, Lw3/c;->c(Lw3/a;J)V

    goto/16 :goto_2

    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING length != 8: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-virtual {v1, v0, v3, v7, v13}, La4/w;->z(La4/n;III)V

    goto/16 :goto_2

    :pswitch_4
    if-nez v13, :cond_24

    and-int/lit8 v5, v6, 0x1

    if-eqz v5, :cond_17

    if-nez v3, :cond_16

    goto/16 :goto_2

    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    rem-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_23

    new-instance v5, La4/g0;

    invoke-direct {v5}, La4/g0;-><init>()V

    invoke-static {v2, v3}, Lc3/h;->I2(II)Ln3/c;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lc3/h;->A2(Ln3/c;I)Ln3/a;

    move-result-object v2

    iget v3, v2, Ln3/a;->b:I

    iget v6, v2, Ln3/a;->c:I

    iget v2, v2, Ln3/a;->d:I

    if-lez v2, :cond_18

    if-le v3, v6, :cond_19

    :cond_18
    if-gez v2, :cond_22

    if-gt v6, v3, :cond_22

    :cond_19
    :goto_8
    iget-object v7, v1, La4/w;->b:Lf4/i;

    invoke-interface {v7}, Lf4/i;->u()S

    move-result v8

    sget-object v10, Lu3/b;->a:[B

    const v10, 0xffff

    and-int/2addr v8, v10

    invoke-interface {v7}, Lf4/i;->E()I

    move-result v7

    if-eq v8, v14, :cond_1f

    const/4 v10, 0x3

    if-eq v8, v10, :cond_1e

    if-eq v8, v9, :cond_1c

    const/4 v13, 0x5

    if-eq v8, v13, :cond_1a

    goto :goto_9

    :cond_1a
    if-lt v7, v4, :cond_1b

    const v13, 0xffffff

    if-gt v7, v13, :cond_1b

    goto :goto_9

    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-static {v2, v7}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    if-ltz v7, :cond_1d

    const/4 v8, 0x7

    goto :goto_9

    :cond_1d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    move v8, v9

    goto :goto_9

    :cond_1f
    const/4 v10, 0x3

    if-eqz v7, :cond_21

    if-ne v7, v15, :cond_20

    goto :goto_9

    :cond_20
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :goto_9
    invoke-virtual {v5, v8, v7}, La4/g0;->c(II)V

    if-eq v3, v6, :cond_22

    add-int/2addr v3, v2

    goto :goto_8

    :cond_22
    iget-object v2, v0, La4/n;->c:La4/t;

    iget-object v3, v2, La4/t;->j:Lw3/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, La4/t;->e:Ljava/lang/String;

    const-string v6, " applyAndAckSettings"

    invoke-static {v4, v2, v6}, La;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, La4/m;

    invoke-direct {v4, v2, v0, v5}, La4/m;-><init>(Ljava/lang/String;La4/n;La4/g0;)V

    invoke-virtual {v3, v4, v11, v12}, Lw3/c;->c(Lw3/a;J)V

    goto/16 :goto_2

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    if-ne v3, v9, :cond_2a

    if-eqz v13, :cond_29

    iget-object v3, v1, La4/w;->b:Lf4/i;

    invoke-interface {v3}, Lf4/i;->E()I

    move-result v3

    invoke-static {}, La4/b;->values()[La4/b;

    move-result-object v4

    array-length v5, v4

    :goto_a
    if-ge v2, v5, :cond_26

    aget-object v6, v4, v2

    iget v7, v6, La4/b;->b:I

    if-ne v7, v3, :cond_25

    move-object v14, v6

    goto :goto_b

    :cond_25
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_26
    const/4 v14, 0x0

    :goto_b
    if-eqz v14, :cond_28

    iget-object v0, v0, La4/n;->c:La4/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v13, :cond_27

    and-int/lit8 v2, v8, 0x1

    if-nez v2, :cond_27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, La4/t;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onReset"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, La4/q;

    const/4 v4, 0x0

    move-object v10, v3

    move-wide v5, v11

    move-object v11, v2

    move-object v12, v0

    move v2, v15

    move v15, v4

    invoke-direct/range {v10 .. v15}, La4/q;-><init>(Ljava/lang/String;La4/t;ILjava/lang/Object;I)V

    iget-object v0, v0, La4/t;->k:Lw3/c;

    invoke-virtual {v0, v3, v5, v6}, Lw3/c;->c(Lw3/a;J)V

    goto/16 :goto_c

    :cond_27
    move v2, v15

    invoke-virtual {v0, v13}, La4/t;->t(I)La4/b0;

    move-result-object v0

    if-eqz v0, :cond_2d

    invoke-virtual {v0, v14}, La4/b0;->j(La4/b;)V

    goto :goto_c

    :cond_28
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM unexpected error code: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TYPE_RST_STREAM length: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " != 4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    move v2, v15

    const/4 v0, 0x5

    if-ne v3, v0, :cond_2c

    if-eqz v13, :cond_2b

    iget-object v0, v1, La4/w;->b:Lf4/i;

    invoke-interface {v0}, Lf4/i;->E()I

    invoke-interface {v0}, Lf4/i;->B()B

    goto :goto_c

    :cond_2b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TYPE_PRIORITY length: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " != 5"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    move v2, v15

    invoke-virtual {v1, v0, v3, v7, v13}, La4/w;->x(La4/n;III)V

    goto :goto_c

    :pswitch_8
    move v2, v15

    invoke-virtual {v1, v0, v3, v7, v13}, La4/w;->h(La4/n;III)V

    :cond_2d
    :goto_c
    return v2

    :cond_2e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR: "

    invoke-static {v2, v3}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, La4/w;->b:Lf4/i;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final e(La4/n;)V
    .locals 4

    const-string v0, "handler"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, La4/w;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, La4/w;->a(ZLa4/n;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Required SETTINGS preface not received"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, La4/g;->a:Lf4/j;

    iget-object v0, p1, Lf4/j;->b:[B

    array-length v0, v0

    int-to-long v0, v0

    iget-object v2, p0, La4/w;->b:Lf4/i;

    invoke-interface {v2, v0, v1}, Lf4/i;->l(J)Lf4/j;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v2, La4/w;->g:Ljava/util/logging/Logger;

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<< CONNECTION "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lf4/j;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lu3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v0}, Lf4/j;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected a connection header but was "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(La4/n;III)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p3

    move/from16 v5, p4

    if-eqz v5, :cond_f

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v3, v2, 0x20

    if-nez v3, :cond_e

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_1

    iget-object v3, v1, La4/w;->b:Lf4/i;

    invoke-interface {v3}, Lf4/i;->B()B

    move-result v3

    sget-object v7, Lu3/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    move v9, v3

    move/from16 v3, p2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    const/4 v9, 0x0

    :goto_1
    invoke-static {v3, v2, v9}, Lf2/e;->E(III)I

    move-result v7

    iget-object v2, v1, La4/w;->b:Lf4/i;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "source"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, La4/n;->c:La4/t;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_2

    and-int/lit8 v3, v5, 0x1

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    const-wide/16 v10, 0x0

    if-eqz v3, :cond_3

    iget-object v0, v0, La4/n;->c:La4/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lf4/g;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    int-to-long v3, v7

    invoke-interface {v2, v3, v4}, Lf4/i;->k(J)V

    invoke-interface {v2, v6, v3, v4}, Lf4/w;->f(Lf4/g;J)J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, La4/t;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v12, La4/o;

    move-object v2, v12

    move-object v4, v0

    move/from16 v5, p4

    invoke-direct/range {v2 .. v8}, La4/o;-><init>(Ljava/lang/String;La4/t;ILf4/g;IZ)V

    iget-object v0, v0, La4/t;->k:Lw3/c;

    invoke-virtual {v0, v12, v10, v11}, Lw3/c;->c(Lw3/a;J)V

    goto/16 :goto_9

    :cond_3
    iget-object v3, v0, La4/n;->c:La4/t;

    invoke-virtual {v3, v5}, La4/t;->h(I)La4/b0;

    move-result-object v3

    if-nez v3, :cond_4

    iget-object v3, v0, La4/n;->c:La4/t;

    sget-object v4, La4/b;->d:La4/b;

    invoke-virtual {v3, v5, v4}, La4/t;->F(ILa4/b;)V

    iget-object v0, v0, La4/n;->c:La4/t;

    int-to-long v3, v7

    invoke-virtual {v0, v3, v4}, La4/t;->z(J)V

    invoke-interface {v2, v3, v4}, Lf4/i;->q(J)V

    goto/16 :goto_9

    :cond_4
    sget-object v0, Lu3/b;->a:[B

    iget-object v0, v3, La4/b0;->i:La4/z;

    int-to-long v12, v7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v14, v12

    :goto_3
    cmp-long v5, v14, v10

    if-lez v5, :cond_c

    iget-object v5, v0, La4/z;->g:La4/b0;

    monitor-enter v5

    :try_start_0
    iget-boolean v7, v0, La4/z;->c:Z

    iget-object v4, v0, La4/z;->e:Lf4/g;

    iget-wide v10, v4, Lf4/g;->c:J

    add-long/2addr v10, v14

    move/from16 p1, v7

    iget-wide v6, v0, La4/z;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    cmp-long v6, v10, v6

    if-lez v6, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    monitor-exit v5

    if-eqz v6, :cond_6

    invoke-interface {v2, v14, v15}, Lf4/i;->q(J)V

    iget-object v0, v0, La4/z;->g:La4/b0;

    sget-object v2, La4/b;->f:La4/b;

    invoke-virtual {v0, v2}, La4/b0;->e(La4/b;)V

    goto :goto_8

    :cond_6
    if-eqz p1, :cond_7

    invoke-interface {v2, v14, v15}, Lf4/i;->q(J)V

    goto :goto_8

    :cond_7
    iget-object v5, v0, La4/z;->d:Lf4/g;

    invoke-interface {v2, v5, v14, v15}, Lf4/w;->f(Lf4/g;J)J

    move-result-wide v5

    const-wide/16 v10, -0x1

    cmp-long v7, v5, v10

    if-eqz v7, :cond_b

    sub-long/2addr v14, v5

    iget-object v5, v0, La4/z;->g:La4/b0;

    monitor-enter v5

    :try_start_1
    iget-boolean v6, v0, La4/z;->f:Z

    if-eqz v6, :cond_8

    iget-object v6, v0, La4/z;->d:Lf4/g;

    iget-wide v10, v6, Lf4/g;->c:J

    invoke-virtual {v6, v10, v11}, Lf4/g;->q(J)V

    const-wide/16 v16, 0x0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_8
    iget-object v6, v0, La4/z;->e:Lf4/g;

    iget-wide v10, v6, Lf4/g;->c:J

    const-wide/16 v16, 0x0

    cmp-long v7, v10, v16

    if-nez v7, :cond_9

    const/4 v7, 0x1

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    :goto_5
    iget-object v10, v0, La4/z;->d:Lf4/g;

    invoke-virtual {v6, v10}, Lf4/g;->J(Lf4/w;)V

    if-eqz v7, :cond_a

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    :goto_6
    monitor-exit v5

    move-wide/from16 v10, v16

    goto :goto_3

    :goto_7
    monitor-exit v5

    throw v0

    :cond_b
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_c
    sget-object v2, Lu3/b;->a:[B

    iget-object v0, v0, La4/z;->g:La4/b0;

    iget-object v0, v0, La4/b0;->b:La4/t;

    invoke-virtual {v0, v12, v13}, La4/t;->z(J)V

    :goto_8
    if-eqz v8, :cond_d

    sget-object v0, Lu3/b;->b:Lt3/q;

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v2}, La4/b0;->i(Lt3/q;Z)V

    :cond_d
    :goto_9
    iget-object v0, v1, La4/w;->b:Lf4/i;

    int-to-long v2, v9

    invoke-interface {v0, v2, v3}, Lf4/i;->q(J)V

    return-void

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(IIII)Ljava/util/List;
    .locals 2

    iget-object v0, p0, La4/w;->d:La4/v;

    iput p1, v0, La4/v;->f:I

    iput p1, v0, La4/v;->c:I

    iput p2, v0, La4/v;->g:I

    iput p3, v0, La4/v;->d:I

    iput p4, v0, La4/v;->e:I

    :cond_0
    :goto_0
    iget-object p1, p0, La4/w;->e:La4/d;

    iget-object p2, p1, La4/d;->d:Lf4/q;

    invoke-virtual {p2}, Lf4/q;->r()Z

    move-result p3

    iget-object p4, p1, La4/d;->c:Ljava/util/ArrayList;

    if-nez p3, :cond_c

    invoke-virtual {p2}, Lf4/q;->B()B

    move-result p2

    sget-object p3, Lu3/b;->a:[B

    and-int/lit16 p3, p2, 0xff

    const/16 v0, 0x80

    if-eq p3, v0, :cond_b

    and-int/lit16 v1, p2, 0x80

    if-ne v1, v0, :cond_3

    const/16 p2, 0x7f

    invoke-virtual {p1, p3, p2}, La4/d;->e(II)I

    move-result p2

    add-int/lit8 p3, p2, -0x1

    if-ltz p3, :cond_1

    sget-object v0, La4/f;->a:[La4/c;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-gt p3, v1, :cond_1

    aget-object p1, v0, p3

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v0, La4/f;->a:[La4/c;

    array-length v0, v0

    sub-int/2addr p3, v0

    iget v0, p1, La4/d;->f:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p3

    if-ltz v0, :cond_2

    iget-object p1, p1, La4/d;->e:[La4/c;

    array-length p3, p1

    if-ge v0, p3, :cond_2

    aget-object p1, p1, v0

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Header index too large "

    invoke-static {p3, p2}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v0, 0x40

    if-ne p3, v0, :cond_4

    sget-object p2, La4/f;->a:[La4/c;

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p2

    invoke-static {p2}, La4/f;->a(Lf4/j;)V

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p3

    new-instance p4, La4/c;

    invoke-direct {p4, p2, p3}, La4/c;-><init>(Lf4/j;Lf4/j;)V

    invoke-virtual {p1, p4}, La4/d;->c(La4/c;)V

    goto :goto_0

    :cond_4
    and-int/lit8 v1, p2, 0x40

    if-ne v1, v0, :cond_5

    const/16 p2, 0x3f

    invoke-virtual {p1, p3, p2}, La4/d;->e(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, La4/d;->b(I)Lf4/j;

    move-result-object p2

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p3

    new-instance p4, La4/c;

    invoke-direct {p4, p2, p3}, La4/c;-><init>(Lf4/j;Lf4/j;)V

    invoke-virtual {p1, p4}, La4/d;->c(La4/c;)V

    goto/16 :goto_0

    :cond_5
    and-int/lit8 p2, p2, 0x20

    const/16 v0, 0x20

    if-ne p2, v0, :cond_8

    const/16 p2, 0x1f

    invoke-virtual {p1, p3, p2}, La4/d;->e(II)I

    move-result p2

    iput p2, p1, La4/d;->b:I

    if-ltz p2, :cond_7

    iget p3, p1, La4/d;->a:I

    if-gt p2, p3, :cond_7

    iget p3, p1, La4/d;->h:I

    if-ge p2, p3, :cond_0

    if-nez p2, :cond_6

    iget-object p2, p1, La4/d;->e:[La4/c;

    array-length p3, p2

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-static {p2, p4, p3, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object p2, p1, La4/d;->e:[La4/c;

    array-length p2, p2

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, La4/d;->f:I

    iput p4, p1, La4/d;->g:I

    iput p4, p1, La4/d;->h:I

    goto/16 :goto_0

    :cond_6
    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, La4/d;->a(I)I

    goto/16 :goto_0

    :cond_7
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid dynamic table size update "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, La4/d;->b:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    const/16 p2, 0x10

    if-eq p3, p2, :cond_a

    if-nez p3, :cond_9

    goto :goto_1

    :cond_9
    const/16 p2, 0xf

    invoke-virtual {p1, p3, p2}, La4/d;->e(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, La4/d;->b(I)Lf4/j;

    move-result-object p2

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p1

    new-instance p3, La4/c;

    invoke-direct {p3, p2, p1}, La4/c;-><init>(Lf4/j;Lf4/j;)V

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    :goto_1
    sget-object p2, La4/f;->a:[La4/c;

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p2

    invoke-static {p2}, La4/f;->a(Lf4/j;)V

    invoke-virtual {p1}, La4/d;->d()Lf4/j;

    move-result-object p1

    new-instance p3, La4/c;

    invoke-direct {p3, p2, p1}, La4/c;-><init>(Lf4/j;Lf4/j;)V

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "index == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p4}, La3/n;->j3(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    return-object p1
.end method

.method public final x(La4/n;III)V
    .locals 10

    if-eqz p4, :cond_9

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x8

    if-eqz v3, :cond_1

    iget-object v3, p0, La4/w;->b:Lf4/i;

    invoke-interface {v3}, Lf4/i;->B()B

    move-result v3

    sget-object v4, Lu3/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, p3, 0x20

    if-eqz v4, :cond_2

    iget-object v4, p0, La4/w;->b:Lf4/i;

    invoke-interface {v4}, Lf4/i;->E()I

    invoke-interface {v4}, Lf4/i;->B()B

    sget-object v4, Lu3/b;->a:[B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, -0x5

    :cond_2
    invoke-static {p2, p3, v3}, Lf2/e;->E(III)I

    move-result p2

    invoke-virtual {p0, p2, v3, p3, p4}, La4/w;->t(IIII)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, La4/n;->c:La4/t;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p4, :cond_3

    and-int/lit8 p2, p4, 0x1

    if-nez p2, :cond_3

    move v1, v2

    :cond_3
    const-wide/16 p2, 0x0

    const/16 v9, 0x5b

    if-eqz v1, :cond_4

    iget-object p1, p1, La4/n;->c:La4/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, La4/t;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, La4/p;

    move-object v3, v1

    move-object v5, p1

    move v6, p4

    move v8, v0

    invoke-direct/range {v3 .. v8}, La4/p;-><init>(Ljava/lang/String;La4/t;ILjava/util/List;Z)V

    iget-object p1, p1, La4/t;->k:Lw3/c;

    invoke-virtual {p1, v1, p2, p3}, Lw3/c;->c(Lw3/a;J)V

    goto/16 :goto_2

    :cond_4
    iget-object p1, p1, La4/n;->c:La4/t;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p4}, La4/t;->h(I)La4/b0;

    move-result-object v1

    if-nez v1, :cond_8

    iget-boolean v1, p1, La4/t;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    monitor-exit p1

    goto :goto_2

    :cond_5
    :try_start_1
    iget v1, p1, La4/t;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p4, v1, :cond_6

    monitor-exit p1

    goto :goto_2

    :cond_6
    :try_start_2
    rem-int/lit8 v1, p4, 0x2

    iget v3, p1, La4/t;->g:I

    rem-int/lit8 v3, v3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v1, v3, :cond_7

    monitor-exit p1

    goto :goto_2

    :cond_7
    :try_start_3
    invoke-static {v7}, Lu3/b;->u(Ljava/util/List;)Lt3/q;

    move-result-object v8

    new-instance v1, La4/b0;

    const/4 v6, 0x0

    move-object v3, v1

    move v4, p4

    move-object v5, p1

    move v7, v0

    invoke-direct/range {v3 .. v8}, La4/b0;-><init>(ILa4/t;ZZLt3/q;)V

    iput p4, p1, La4/t;->f:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p1, La4/t;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, La4/t;->i:Lw3/f;

    invoke-virtual {v0}, Lw3/f;->f()Lw3/c;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p1, La4/t;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "] onStream"

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v3, La4/k;

    invoke-direct {v3, p4, p1, v1, v2}, La4/k;-><init>(Ljava/lang/String;La4/t;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3, p2, p3}, Lw3/c;->c(Lw3/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_8
    monitor-exit p1

    invoke-static {v7}, Lu3/b;->u(Ljava/util/List;)Lt3/q;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, La4/b0;->i(Lt3/q;Z)V

    :goto_2
    return-void

    :goto_3
    monitor-exit p1

    throw p2

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(La4/n;III)V
    .locals 9

    if-eqz p4, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, La4/w;->b:Lf4/i;

    invoke-interface {v0}, Lf4/i;->B()B

    move-result v0

    sget-object v1, Lu3/b;->a:[B

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La4/w;->b:Lf4/i;

    invoke-interface {v1}, Lf4/i;->E()I

    move-result v1

    const v2, 0x7fffffff

    and-int v6, v1, v2

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v0}, Lf2/e;->E(III)I

    move-result p2

    invoke-virtual {p0, p2, v0, p3, p4}, La4/w;->t(IIII)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p1, La4/n;->c:La4/t;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v5

    :try_start_0
    iget-object p1, v5, La4/t;->B:Ljava/util/LinkedHashSet;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, La4/b;->d:La4/b;

    invoke-virtual {v5, v6, p1}, La4/t;->F(ILa4/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object p1, v5, La4/t;->B:Ljava/util/LinkedHashSet;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v5

    iget-object p1, v5, La4/t;->k:Lw3/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, v5, La4/t;->e:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x5b

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] onRequest"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance p2, La4/q;

    const/4 v8, 0x2

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, La4/q;-><init>(Ljava/lang/String;La4/t;ILjava/lang/Object;I)V

    const-wide/16 p3, 0x0

    invoke-virtual {p1, p2, p3, p4}, Lw3/c;->c(Lw3/a;J)V

    :goto_1
    return-void

    :goto_2
    monitor-exit v5

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
