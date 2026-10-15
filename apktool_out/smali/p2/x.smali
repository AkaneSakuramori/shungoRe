.class public abstract Lp2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lcom/auth0/android/request/internal/i;

.field public static final a:Lp2/u;

.field public static final b:Lp2/u;

.field public static final c:Lm2/j;

.field public static final d:Lp2/v;

.field public static final e:Lp2/v;

.field public static final f:Lp2/v;

.field public static final g:Lp2/v;

.field public static final h:Lp2/u;

.field public static final i:Lp2/u;

.field public static final j:Lp2/u;

.field public static final k:Lm2/j;

.field public static final l:Lp2/v;

.field public static final m:Lm2/j;

.field public static final n:Lm2/j;

.field public static final o:Lp2/u;

.field public static final p:Lp2/u;

.field public static final q:Lp2/u;

.field public static final r:Lp2/u;

.field public static final s:Lp2/u;

.field public static final t:Lp2/u;

.field public static final u:Lp2/u;

.field public static final v:Lp2/u;

.field public static final w:Lp2/v;

.field public static final x:Lp2/u;

.field public static final y:Lm2/j;

.field public static final z:Lp2/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lm2/j;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    invoke-virtual {v0}, Lm2/b0;->a()Lm2/k;

    move-result-object v0

    const-class v1, Ljava/lang/Class;

    invoke-static {v1, v0}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v0

    sput-object v0, Lp2/x;->a:Lp2/u;

    new-instance v0, Lm2/j;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    invoke-virtual {v0}, Lm2/b0;->a()Lm2/k;

    move-result-object v0

    const-class v1, Ljava/util/BitSet;

    invoke-static {v1, v0}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v0

    sput-object v0, Lp2/x;->b:Lp2/u;

    new-instance v0, Lm2/j;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    new-instance v1, Lm2/j;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lm2/j;-><init>(I)V

    sput-object v1, Lp2/x;->c:Lm2/j;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2, v0}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object v0

    sput-object v0, Lp2/x;->d:Lp2/v;

    new-instance v0, Lm2/j;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Byte;

    invoke-static {v1, v2, v0}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object v0

    sput-object v0, Lp2/x;->e:Lp2/v;

    new-instance v0, Lm2/j;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Short;

    invoke-static {v1, v2, v0}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object v0

    sput-object v0, Lp2/x;->f:Lp2/v;

    new-instance v0, Lm2/j;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Integer;

    invoke-static {v1, v2, v0}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object v0

    sput-object v0, Lp2/x;->g:Lp2/v;

    new-instance v0, Lm2/j;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    invoke-virtual {v0}, Lm2/b0;->a()Lm2/k;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1, v0}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v0

    sput-object v0, Lp2/x;->h:Lp2/u;

    new-instance v0, Lm2/j;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    invoke-virtual {v0}, Lm2/b0;->a()Lm2/k;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v1, v0}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v0

    sput-object v0, Lp2/x;->i:Lp2/u;

    new-instance v0, Lm2/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm2/j;-><init>(I)V

    invoke-virtual {v0}, Lm2/b0;->a()Lm2/k;

    move-result-object v0

    const-class v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-static {v2, v0}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v0

    sput-object v0, Lp2/x;->j:Lp2/u;

    new-instance v0, Lm2/j;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lm2/j;-><init>(I)V

    sput-object v0, Lp2/x;->k:Lm2/j;

    const/4 v0, 0x3

    new-instance v2, Lm2/j;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/Character;

    invoke-static {v3, v4, v2}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object v2

    sput-object v2, Lp2/x;->l:Lp2/v;

    new-instance v2, Lm2/j;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    new-instance v3, Lm2/j;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lm2/j;-><init>(I)V

    sput-object v3, Lp2/x;->m:Lm2/j;

    new-instance v3, Lm2/j;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lm2/j;-><init>(I)V

    sput-object v3, Lp2/x;->n:Lm2/j;

    const-class v3, Ljava/lang/String;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->o:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/lang/StringBuilder;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->p:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/lang/StringBuffer;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->q:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/net/URL;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->r:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/net/URI;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->s:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    new-instance v3, Lp2/u;

    const-class v4, Ljava/net/InetAddress;

    invoke-direct {v3, v4, v2, v1}, Lp2/u;-><init>(Ljava/lang/Object;Lm2/b0;I)V

    sput-object v3, Lp2/x;->t:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/util/UUID;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->u:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    invoke-virtual {v2}, Lm2/b0;->a()Lm2/k;

    move-result-object v2

    const-class v3, Ljava/util/Currency;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->v:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    new-instance v3, Lp2/v;

    const-class v4, Ljava/util/Calendar;

    const-class v5, Ljava/util/GregorianCalendar;

    invoke-direct {v3, v4, v5, v2, v1}, Lp2/v;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;I)V

    sput-object v3, Lp2/x;->w:Lp2/v;

    new-instance v2, Lm2/j;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    const-class v3, Ljava/util/Locale;

    invoke-static {v3, v2}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object v2

    sput-object v2, Lp2/x;->x:Lp2/u;

    new-instance v2, Lm2/j;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lm2/j;-><init>(I)V

    sput-object v2, Lp2/x;->y:Lm2/j;

    new-instance v3, Lp2/u;

    const-class v4, Lm2/q;

    invoke-direct {v3, v4, v2, v1}, Lp2/u;-><init>(Ljava/lang/Object;Lm2/b0;I)V

    sput-object v3, Lp2/x;->z:Lp2/u;

    new-instance v1, Lcom/auth0/android/request/internal/i;

    invoke-direct {v1, v0}, Lcom/auth0/android/request/internal/i;-><init>(I)V

    sput-object v1, Lp2/x;->A:Lcom/auth0/android/request/internal/i;

    return-void
.end method

.method public static a(Ljava/lang/Class;Lm2/b0;)Lp2/u;
    .locals 2

    new-instance v0, Lp2/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lp2/u;-><init>(Ljava/lang/Object;Lm2/b0;I)V

    return-object v0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;
    .locals 2

    new-instance v0, Lp2/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lp2/v;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;I)V

    return-object v0
.end method
