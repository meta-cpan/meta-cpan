DESCRIPTION = "LWP::Protocol::PSGI is a module to hijack any code that uses \
LWP::UserAgent underneath such that any HTTP or HTTPS requests can be \
routed to your own \
PSGI application."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-Protocol-PSGI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "guard-perl"
DEPENDS += "libwww-perl-perl"
DEPENDS += "plack-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/LWP-Protocol-PSGI-0.07.tar.gz"

SRC_URI[md5sum] = "06349aa3bb408153eb9644c62862e6a3"
SRC_URI[sha256sum] = "72c8e31073685b31a9fbd86b536a18a20fcdec879e63f8a7bc97d909d7412b7d"

S = "${WORKDIR}/LWP-Protocol-PSGI-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
