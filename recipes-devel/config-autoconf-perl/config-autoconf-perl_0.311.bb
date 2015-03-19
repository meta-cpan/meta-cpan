DESCRIPTION = "Config::AutoConf is intended to provide the same opportunities to Perl \
developers as GNU Autoconf <http://www.gnu.org/software/autoconf/> does \
for Shell developers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-AutoConf"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.311.tar.gz"

SRC_URI[md5sum] = "fa19f46bbd5bb0bd23ee41e8fd7b533f"
SRC_URI[sha256sum] = "80151a8f1346e61f66523f33c783962e23c8bd66a7b93dca79fe531dd075bc50"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "extutils-cbuilder-perl"
RRECOMMENDS_${PN} += "file-slurp-tiny-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
