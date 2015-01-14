DESCRIPTION = ""Log::Any\" provides a standard log production API for modules. \
Log::Any::Adapter allows applications to choose the mechanism for log \
consumption, whether screen, file or another logging mechanism like \
Log::Dispatch or Log::Log4perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Log-Any-1.03.tar.gz"

SRC_URI[md5sum] = "1a43f418fa351d231cbb1c22b55a46e4"
SRC_URI[sha256sum] = "6400631bb20aa6f891aa7c481ae0ebe713707ed1a910f929dc29c9e646ccb281"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
