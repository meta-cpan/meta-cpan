DESCRIPTION = ""constant::defer\" creates a subroutine which on the first call runs \
given code to calculate its value, and on any subsequent calls just \
returns that value, like a constant. The value code is discarded once \
run, allowing it to be garbage collected."

SECTION = "libs"
LICENSE = "GPL-3.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/constant-defer"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/constant-defer-6.tar.gz"

SRC_URI[md5sum] = "6af9912fa420340e9e171ac81f450492"
SRC_URI[sha256sum] = "7b21263198ca22686efff3ae987a240be423dd2160afdeb29fe716d032986ffa"

S = "${WORKDIR}/constant-defer-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
