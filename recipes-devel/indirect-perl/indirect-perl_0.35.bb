DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/indirect"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/indirect-0.35.tar.gz"

SRC_URI[md5sum] = "98bdb0d19044176d9360994956ff2431"
SRC_URI[sha256sum] = "7cebc51f210f8e547e1ca0ff451439edfefb356b4ceb076d8028fb16469e0c74"

S = "${WORKDIR}/indirect-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
