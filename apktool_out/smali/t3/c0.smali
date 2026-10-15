.class public final Lt3/c0;
.super Lt3/d0;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:J

.field public final d:Lf4/i;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLt3/u;Lf4/g;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lt3/c0;->b:I

    iput-object p3, p0, Lt3/c0;->e:Ljava/lang/Object;

    iput-wide p1, p0, Lt3/c0;->c:J

    iput-object p4, p0, Lt3/c0;->d:Lf4/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLf4/q;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lt3/c0;->b:I

    iput-object p1, p0, Lt3/c0;->e:Ljava/lang/Object;

    iput-wide p2, p0, Lt3/c0;->c:J

    iput-object p4, p0, Lt3/c0;->d:Lf4/i;

    return-void
.end method
